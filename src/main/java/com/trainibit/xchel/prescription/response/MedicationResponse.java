package com.trainibit.xchel.prescription.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class MedicationResponse {

    private Long id;
    private String name;
    private String active_principle;
    private String concentration;
    private String pharmaceutical_form;
    private String laboratory;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private Boolean activate;
    private Long medication_type_id;
    private UUID uuid;

}
