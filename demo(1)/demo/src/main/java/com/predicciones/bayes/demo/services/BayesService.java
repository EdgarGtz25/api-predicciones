package com.predicciones.bayes.demo.services;

import com.predicciones.bayes.demo.dto.Features;
import com.predicciones.bayes.demo.dto.FeaturesResponse;
import org.springframework.http.ResponseEntity;

public interface BayesService {
    ResponseEntity<FeaturesResponse> predict(Features params);
}
