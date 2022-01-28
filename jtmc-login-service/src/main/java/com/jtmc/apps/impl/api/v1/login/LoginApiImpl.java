package com.jtmc.apps.impl.api.v1.login;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.jtmc.apps.api.v1.login.LoginApi;
import com.jtmc.apps.api.v1.login.LoginResponse;
import com.jtmc.apps.impl.application.user.UserAppImpl;
import com.jtmc.apps.impl.domain.Users;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.jackson.io.JacksonSerializer;
import io.jsonwebtoken.security.Keys;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.SecretKey;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;

public class LoginApiImpl implements LoginApi {
    private Logger logger = LoggerFactory.getLogger(LoginApiImpl.class);

    @Inject
    private ObjectMapper objectMapper;

    @Inject
    @Named("key")
    private String secretKey;

    @Inject
    private UserAppImpl userApp;

    @Override
    public LoginResponse login(String email, String password) {
        checkArgument(StringUtils.isNotBlank(email));
        checkArgument(StringUtils.isNotBlank(password));

        Optional<Users> user = userApp.selectUser(email, password);
        if (!user.isPresent()) {
            logger.warn("User not found for provided credentials");
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }

        String jws = buildJWS(user.get().getName());

        LoginResponse response = new LoginResponse();
        response.setId_token(jws);
        return  response;
    }

    private String buildJWS(String user){
        SecretKey key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
        return Jwts
                .builder()
                .serializeToJsonWith(new JacksonSerializer(objectMapper))
                .setSubject(user)
                .signWith(key)
                .compact();
    }
}
