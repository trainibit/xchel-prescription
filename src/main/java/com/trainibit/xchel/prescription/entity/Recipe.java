package com.trainibit.xchel.prescription.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

    @Data
    @Entity(name = "Recipe")
    public class Recipe {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "date", nullable = false)
        private LocalDate date;

        @Column(name = "expiration_date_recipe", nullable = false)
        private LocalDate expiration_date_recipe;

        @Column(name = "created_date", nullable = false)
        @CreationTimestamp
        private Timestamp createdDate;

        @Column(name = "updated_date", nullable = false)
        @UpdateTimestamp
        private Timestamp updatedDate;

        @Column(name = "patient_uuid")
        private UUID patient_uuid;

        @Column(name = "doctor_uuid")
        private UUID doctor_uuid;

        @Column(name = "uuid")
        private UUID uuid;

        @Column(name = "activate", nullable = false)
        private Boolean activated;

    }
