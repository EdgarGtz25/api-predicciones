package com.predicciones.bayes.demo.services.impl;

import com.predicciones.bayes.demo.clients.BayesClient;
import com.predicciones.bayes.demo.dto.Features;
import com.predicciones.bayes.demo.dto.FeaturesResponse;
import com.predicciones.bayes.demo.services.BayesService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BayesServicesImpl implements BayesService {

    @Autowired
    private BayesClient bayesClient;

    @Override
    public ResponseEntity<FeaturesResponse> predict(Features params) {
        try {
            return bayesClient.predict(params);
        } catch (Exception e) {
            // Manejo de excepciones, por ejemplo, devolver una respuesta de error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}