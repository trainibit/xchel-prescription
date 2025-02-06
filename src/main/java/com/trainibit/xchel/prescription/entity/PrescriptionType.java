package com.trainibit.xchel.prescription.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Entity(name = "PrescriptionType")
public class PrescriptionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "created_date", insertable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "updated_date", insertable = false)
    @UpdateTimestamp
    private Timestamp updatedDate;

    @Column(name = "activate", nullable = false)
    private Boolean activate;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

}