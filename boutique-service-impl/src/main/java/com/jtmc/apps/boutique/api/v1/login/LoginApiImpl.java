package com.jtmc.apps.boutique.api.v1.login;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.jtmc.apps.boutique.application.LoginApplication;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.jackson.io.JacksonSerializer;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public class LoginApiImpl implements LoginApi {
    private Logger logger = LoggerFactory.getLogger(LoginApiImpl.class);

    @Inject
    private ObjectMapper objectMapper;

    @Inject
    @Named("key")
    private String secretKey;

    @Inject
    private LoginApplication userApp;

    @Override
    public LoginResponse login(String email, String password) {
        throw new UnsupportedOperationException();
//        checkArgument(StringUtils.isNotBlank(email));
//        checkArgument(StringUtils.isNotBlank(password));
//
//        Optional<Users> user = userApp.selectUser(email, password);
//        if (!user.isPresent()) {
//            logger.warn("User not found for provided credentials");
//            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
//        }
//
//        String jws = buildJWS(user.get().getName());
//
//        LoginResponse response = new LoginResponse();
//        response.setId_token(jws);
//        return  response;
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
