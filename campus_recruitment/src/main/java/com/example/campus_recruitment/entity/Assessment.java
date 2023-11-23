package com.example.campus_recruitment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="assessment")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id")
    private  @Getter
    @Setter int assessmentId;


    @Column(name = "assessment_name")
    private @Getter @Setter String assessmentName;
    @Column(name = "assessment_type")
    private @Getter @Setter String assessmentType;
    @Column(name = "assessment_date")
    private @Getter @Setter String assessmentDate;

    @Column(name = "assessment_status")
    private @Getter @Setter String assessmentStatus;
    @ManyToMany(fetch = FetchType.EAGER,cascade = { CascadeType.MERGE })
    @JoinColumn(name = "applicant_id")
    private @Getter @Setter  List<Applicant> applicant;

    @ManyToMany(cascade = { CascadeType.MERGE },mappedBy = "assessment" )
    @JsonIgnore
    private List<User> user;

//    @OneToMany(cascade = { CascadeType.MERGE },mappedBy = "feedback" )
//    @JsonIgnore
//    private @Getter @Setter List<Feedback> feedback;
//    @ManyToOne(fetch = FetchType.EAGER,cascade = { CascadeType.MERGE })
//    @JoinColumn(name = "round_id")
//    private @Getter @Setter Round round;




}
