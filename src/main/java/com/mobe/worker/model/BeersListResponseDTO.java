package com.mobe.worker.model;

import java.util.List;

public record BeersListResponseDTO(
        List<BeersDTO> beersList
) {
}
