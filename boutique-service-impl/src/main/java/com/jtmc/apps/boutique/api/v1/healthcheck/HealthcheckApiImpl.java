package com.jtmc.apps.boutique.api.v1.healthcheck;

public class HealthcheckApiImpl implements HealthcheckApi {
    @Override
    public String healthcheck() {
        return "all chido! for boutique :)";
    }
}
