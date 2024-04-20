package com.example.kafka.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String lastname;
}
