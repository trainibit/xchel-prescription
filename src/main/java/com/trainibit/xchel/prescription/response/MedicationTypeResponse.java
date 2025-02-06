package com.trainibit.xchel.prescription.response;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Data
public class MedicationTypeResponse implements Serializable {

        private Long id;
        private String description;
        private Timestamp createdDate;
        private Timestamp updatedDate;
        private Boolean activate;
        private UUID uuid;
}
