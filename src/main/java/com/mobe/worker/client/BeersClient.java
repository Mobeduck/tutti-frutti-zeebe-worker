package com.mobe.worker.client;

import com.mobe.worker.model.BeersListResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.mobe.worker.util.Constants.*;

@FeignClient(name = BEERS_CLIENT, url = "${services.beers.url}")
public interface BeersClient {

    @GetMapping("${services.beers.ale}")
    BeersListResponseDTO getAleBeerList();

    @GetMapping("${services.beers.stouts}")
    BeersListResponseDTO getStoutsBeerList();
}
