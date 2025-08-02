package com.mobe.worker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RatingBeerDTO(
        @JsonProperty("average")
        Integer average,

        @JsonProperty("reviews")
        Integer reviews
) {
}
