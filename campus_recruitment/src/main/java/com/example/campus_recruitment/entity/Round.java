package com.example.campus_recruitment.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="round")

public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "round_id")
    private  @Getter @Setter int roundId;


    @Column(name = "round_name")
    private @Getter @Setter String roundName;


}
