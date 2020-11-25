package com.github.aicfr.netflix.roulette.service;

import com.github.aicfr.netflix.roulette.model.TvShow;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TvShowService {
    public List<TvShow> get() {
        List<TvShow> shows = new ArrayList<>();
        TvShow show1 = TvShow.builder()
                .id(UUID.randomUUID().toString())
                .title("Le jeu de la dame")
                .overview("En pleine guerre froide, Beth Harmon est une orpheline prodige des échecs. Suivez-la dans sa quête pour devenir la plus grande joueuse d'échecs du monde tout en affrontant des problèmes d'addiction.")
                .build();

        shows.add(show1);

        return shows;
    }
}
