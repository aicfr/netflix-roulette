package com.github.aicfr.netflix.roulette.controller;

import com.github.aicfr.netflix.roulette.model.TvShow;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Path("shows")
public class TvShowController {
    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        List<TvShow> shows = new ArrayList<>();
        TvShow t = TvShow.builder()
                .id(UUID.randomUUID().toString())
                .title("Le jeu de la dame")
                .overview("En pleine guerre froide, Beth Harmon est une orpheline prodige des échecs. Suivez-la dans sa quête pour devenir la plus grande joueuse d'échecs du monde tout en affrontant des problèmes d'addiction.")
                .build();

        shows.add(t);

        return Response
                .status(Response.Status.OK)
                .entity(shows)
                .build();
    }
}
