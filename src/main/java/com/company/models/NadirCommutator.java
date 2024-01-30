package com.company.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "NadirCommutator")
@Table(name = "nadir_commutator")
@Setter
@Getter
@NoArgsConstructor
public class NadirCommutator {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private boolean xD28On;

    private boolean yD29On;

    private boolean zD30On;

    private int barD9;

    private int angleD9;

    private int barD10;

    private int angleD10;

}
