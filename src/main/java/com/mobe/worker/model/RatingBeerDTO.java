package com.mobe.worker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RatingBeerDTO(
        @JsonProperty("average")
        Float average,

        @JsonProperty("reviews")
        Integer reviews
) {
}
