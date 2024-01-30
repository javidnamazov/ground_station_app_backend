package com.company.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "SouthCommutator")
@Table(name = "south_commutator")
@Setter
@Getter
@NoArgsConstructor
public class SouthCommutator {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private boolean xD25On;

    private boolean yD26On;

    private boolean zD27On;

    private int barD6;

    private int angleD6;

    private int barD7;

    private int angleD7;

    private int barD8;

    private int angleD8;

}
