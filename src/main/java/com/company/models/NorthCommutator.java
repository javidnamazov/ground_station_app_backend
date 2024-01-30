package com.company.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "NorthCommutator")
@Table(name = "north_commutator")
@Setter
@Getter
@NoArgsConstructor
public class NorthCommutator {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private boolean xD22On;

    private boolean yD23On;

    private boolean zD24On;

    private int barD3;

    private int angleD3;

    private int barD4;

    private int angleD4;

    private int barD5;

    private int angleD5;



}
