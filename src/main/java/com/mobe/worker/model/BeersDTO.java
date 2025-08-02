package com.mobe.worker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BeersDTO(
        @JsonProperty("price")
        String price,

        @JsonProperty("name")
        String name,

        @JsonProperty("rating")
        RatingBeerDTO rating,

        @JsonProperty("image")
        String image,

        @JsonProperty("id")
        Integer id
) {
}
