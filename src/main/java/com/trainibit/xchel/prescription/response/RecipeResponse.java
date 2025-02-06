package com.trainibit.xchel.prescription.response;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class RecipeResponse {
    private Long id;
    private LocalDate date;
    private LocalDate expiration_date_recipe;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private UUID patient_uuid;
    private UUID doctor_uuid;
    private UUID uuid;
    private Boolean activated;

}
