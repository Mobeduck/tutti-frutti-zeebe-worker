package com.mobe.worker.service.impl;

import com.mobe.worker.client.BeersClient;
import com.mobe.worker.model.BeersListResponseDTO;
import com.mobe.worker.service.ShowListAleBeersHandler;
import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.api.worker.JobClient;
import io.camunda.spring.client.annotation.JobWorker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class ShowListAleBeersHandlerImpl implements ShowListAleBeersHandler {

    private BeersClient beersClient;

    @Override
    @JobWorker(type= "obtenerListaCervesasAle", autoComplete = true)
    public void getAleBeersList(JobClient client, ActivatedJob job) throws InterruptedException {
        Map<String, Object> applicantInfo = job.getVariablesAsMap();

        try {
            BeersListResponseDTO response = beersClient.getAleBeerList();

            client.newCompleteCommand(job.getKey())
                    .variables(applicantInfo)
                    .send()
                    .join();
        } catch (Exception e) {
            client.newFailCommand(job.getKey())
                    .retries(job.getRetries() - 1)
                    .errorMessage("Error: " + e.getMessage())
                    .send()
                    .join();

            throw new InterruptedException("Error: " + e.getMessage());
        }
    }

}
