package com.github.aicfr.netflix.roulette.controller;

import com.github.aicfr.netflix.roulette.service.TvShowService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("shows")
public class TvShowController {
    @Inject
    private TvShowService service;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response
                .status(Response.Status.OK)
                .entity(service.get())
                .build();
    }
}
