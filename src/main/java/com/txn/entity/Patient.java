package com.txn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientNo;

    private String name;

    private String gender;

    private String mobile;

    private int age;

}
