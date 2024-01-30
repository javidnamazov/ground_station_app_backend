package com.company.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Main")
@Table(name = "main")
@Setter
@Getter
@NoArgsConstructor
public class Main {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long gpsneo6m;

    private Long acs712;

    private Long bme280;

    private Long hmc5883;

    private Long mpu6050;

    private Long temt6000;

    private Long ags02ma;

    private String binaryCodeText;


}
