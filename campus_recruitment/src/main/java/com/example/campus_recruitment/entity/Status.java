package com.example.campus_recruitment.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private  @Getter @Setter int statusId;


    @Column(name = "status")
    private @Getter @Setter String status;

    @OneToOne

    @JoinColumn(name = "applicant_id")

    private Applicant applicant;



}
