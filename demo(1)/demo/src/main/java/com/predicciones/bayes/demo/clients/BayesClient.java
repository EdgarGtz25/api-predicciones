package com.predicciones.bayes.demo.clients;

import com.predicciones.bayes.demo.dto.Features;
import com.predicciones.bayes.demo.dto.FeaturesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "flaskClient", url = "http://localhost:5000")  // URL del servidor Flask
public interface BayesClient {
    @PostMapping(value = "/predict", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<FeaturesResponse> predict(@RequestBody Features params);
}
