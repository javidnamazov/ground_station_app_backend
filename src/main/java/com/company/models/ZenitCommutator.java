package com.company.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "ZenitCommutator")
@Table(name = "zenit_commutator")
@Setter
@Getter
@NoArgsConstructor
public class ZenitCommutator {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private boolean xD31On;

    private boolean yD32On;

    private boolean zD33On;

    private int barD11;

    private int angleD11;

    private int barD12;

    private int angleD12;

}
