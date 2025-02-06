package com.trainibit.xchel.prescription.response;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class MedicalPrescriptionResponse {

        private Long id;
        private String frequency;
        private String dosage;
        private String indication;
        private Timestamp created_date;
        private Timestamp updated_date;
        private Boolean activate;
        private UUID uuid;
        private Long recipe_id;
        private Long prescription_type_id;
        private Long via_administration_id;
        private Long medication_id;

        //private FederalStateResponse federalState;
// private List<RolesByUserResponse> roles;
    }

