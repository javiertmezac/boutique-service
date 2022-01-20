package com.jtmc.apps.boutique.api.v1.healthcheck;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/public/healthcheck")
public interface HealthcheckApi {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    String healthcheck();

}
