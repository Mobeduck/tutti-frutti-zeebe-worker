package com.mobe.worker.service;

import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.api.worker.JobClient;

public interface ShowListAleBeersHandler {

    void getAleBeersList(JobClient client, ActivatedJob job) throws InterruptedException;

}
