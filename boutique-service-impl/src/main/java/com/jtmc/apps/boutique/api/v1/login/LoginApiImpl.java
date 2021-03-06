package com.jtmc.apps.boutique.api.v1.login;

import com.google.inject.Inject;
import com.jtmc.apps.boutique.application.login.LoginApplication;
import com.jtmc.apps.boutique.domain.Users;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.google.common.base.Preconditions.checkArgument;

public class LoginApiImpl implements LoginApi {
    final private Logger logger = LoggerFactory.getLogger(LoginApiImpl.class);

    @Inject
    private LoginApplication loginApp;

    @Override
    public LoginResponse login(String email, String password) {
        checkArgument(StringUtils.isNotBlank(email));
        checkArgument(StringUtils.isNotBlank(password));

        Users user = loginApp.selectUser(email, password);
        String jws = loginApp.buildJWS(user.getUsername());

        LoginResponse response = new LoginResponse();
        response.setId_token(jws);
        return  response;
    }
}
