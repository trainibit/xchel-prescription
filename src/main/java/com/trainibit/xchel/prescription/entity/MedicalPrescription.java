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
@Entity(name = "MedicalPrescription")
public class MedicalPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "frequency", nullable = false, length = Integer.MAX_VALUE)
    private String frequency;

    @Column(name = "dosage", nullable = false, length = Integer.MAX_VALUE)
    private String dosage;

    @Column(name = "indication", nullable = false, length = Integer.MAX_VALUE)
    private String indication;

    @Column(name = "created_date", insertable = false, updatable = false)
    @CreationTimestamp
    private Timestamp created_date;

    @Column(name = "updated_date", insertable = false)
    @UpdateTimestamp
    private Timestamp updated_date;

    @Column(name = "activate", nullable = false)
    private Boolean activate;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", nullable = false)
    private Long recipe_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_type_id", nullable = false)
    private Long prescription_type_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "via_administration_id", nullable = false)
    private Long via_administration_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medication_id", nullable = false)
    private Long medication_id;

//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "recipe_id", nullable = false)
//    private User ;
//
//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "role_id", nullable = false)
//    private Role role;

}

