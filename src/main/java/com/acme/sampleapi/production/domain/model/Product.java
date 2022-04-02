package com.acme.sampleapi.production.domain.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@With
public class Product implements Serializable {
    private int id;
    private String name;
    private String description;
}
