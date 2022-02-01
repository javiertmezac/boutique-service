package com.jtmc.apps.boutique.api.v1.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginResponseTest {

    @Test
    void testGetIdToken_shouldReturn_expectedValue() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setId_token("blah");

        Assertions.assertEquals("blah", loginResponse.getId_token());
    }
}