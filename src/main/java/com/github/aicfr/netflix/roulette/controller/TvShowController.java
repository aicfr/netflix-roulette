package com.github.aicfr.netflix.roulette.controller;

import com.github.aicfr.netflix.roulette.service.TvShowService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.OK;

@Path("shows")
public class TvShowController {
    @Inject
    private TvShowService service;

    @GET
    @Path("")
    @Produces(APPLICATION_JSON)
    public Response get() {
        return Response
                .status(OK)
                .entity(service.get())
                .build();
    }
}
