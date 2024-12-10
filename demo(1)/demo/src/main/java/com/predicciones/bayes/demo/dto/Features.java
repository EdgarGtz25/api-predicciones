package com.predicciones.bayes.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Features {
    private byte hair;
    private byte feathers;
    private byte eggs;
    private byte milk;
    private byte airborne;
    private byte aquatic;
    private byte predator;
    private byte toothed;
    private byte backbone;
    private byte breathes;
    private byte venomous;
    private byte fins;
    private byte legs;
    private byte tail;
    private byte domestic;
    private byte catsize;
}
