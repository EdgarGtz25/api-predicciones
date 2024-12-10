package com.predicciones.bayes.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "${app.api.bayes}")
public interface BayesClient {
    @PostMapping(value = "/api/predict/", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> predict(@RequestBody String params);
}
