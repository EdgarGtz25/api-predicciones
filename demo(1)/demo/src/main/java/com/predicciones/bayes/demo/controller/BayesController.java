package com.predicciones.bayes.demo.controller;


import com.predicciones.bayes.demo.dto.Features;
import com.predicciones.bayes.demo.dto.FeaturesResponse;
import com.predicciones.bayes.demo.services.BayesService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Log4j2
public class BayesController {
    @Autowired
    private  BayesService bayesService;

    @PostMapping()
    public ResponseEntity<FeaturesResponse> predict(@RequestBody Features features) {
        
        return bayesService.predict(features);
    }

}