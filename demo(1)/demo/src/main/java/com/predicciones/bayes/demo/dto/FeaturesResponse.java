package com.predicciones.bayes.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FeaturesResponse {
    private String animal;
    private String probability;
}
