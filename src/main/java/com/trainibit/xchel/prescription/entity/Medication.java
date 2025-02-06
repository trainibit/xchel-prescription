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
@Entity(name = "Medication")
public class Medication {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private Long id;

        @Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
        private String name;

        @Column(name = "active_principle", nullable = false, length = Integer.MAX_VALUE)
        private String active_principle;

        @Column(name = "concentration", nullable = false, length = Integer.MAX_VALUE)
        private String concentration;

        @Column(name = "pharmaceutical_form", nullable = false, length = Integer.MAX_VALUE)
        private String pharmaceutical_form;

        @Column(name = "laboratory", nullable = false, length = Integer.MAX_VALUE)
        private String laboratory;

        @Column(name = "created_date", insertable = false, updatable = false)
        @CreationTimestamp
        private Timestamp createdDate;

        @Column(name = "updated_date", insertable = false)
        @UpdateTimestamp
        private Timestamp updatedDate;

        @Column(name = "activate", nullable = false)
        private Boolean activate;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "medication_type_id", nullable = false)
        private Long medication_type_id;

        @Column(name = "uuid", nullable = false)
        private UUID uuid;

//        @JsonBackReference
//        @ManyToOne(fetch = FetchType.EAGER, optional = false)
//        @JoinColumn(name = "user_id", nullable = false)
//        private User user;
//
//        @ManyToOne(fetch = FetchType.EAGER, optional = false)
//        @JoinColumn(name = "role_id", nullable = false)
//        private Role role;

}