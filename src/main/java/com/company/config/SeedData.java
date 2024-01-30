package com.company.config;

import com.company.models.*;
import com.company.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private MainService mainService;

    @Autowired
    private NorthCommutatorService nCommutatorService;

    @Autowired
    private SouthCommutatorService sCommutatorService;

    @Autowired
    private NadirCommutatorService ndCommutatorService;

    @Autowired
    private ZenitCommutatorService zCommutatorService;

    @Override
    public void run(String... args) throws Exception {

        Main main = new Main();
        main.setGpsneo6m((long)725);
        main.setAcs712((long)398);
        main.setBme280((long)541);
        main.setHmc5883((long)867);
        main.setMpu6050((long)123);
        main.setTemt6000((long)954);
        main.setAgs02ma((long)632);
        main.setBinaryCodeText("salam");

        mainService.save(main);

        NorthCommutator comm = new NorthCommutator();
        comm.setXD22On(true);
        comm.setYD23On(true);
        comm.setZD24On(true);
        comm.setBarD3(75);
        comm.setBarD4(35);
        comm.setBarD5(55);
        comm.setAngleD3(120);
        comm.setAngleD4(255);
        comm.setAngleD5(310);

        nCommutatorService.save(comm);

        SouthCommutator sCom = new SouthCommutator();
        sCom.setXD25On(true);
        sCom.setYD26On(true);
        sCom.setZD27On(true);
        sCom.setBarD6(75);
        sCom.setBarD7(35);
        sCom.setBarD8(55);
        sCom.setAngleD6(120);
        sCom.setAngleD7(255);
        sCom.setAngleD8(310);

        sCommutatorService.save(sCom);

        NadirCommutator ndCom = new NadirCommutator();
        ndCom.setXD28On(true);
        ndCom.setYD29On(true);
        ndCom.setZD30On(false);
        ndCom.setBarD9(75);
        ndCom.setBarD10(35);
        ndCom.setAngleD9(120);
        ndCom.setAngleD10(255);

        ndCommutatorService.save(ndCom);

        ZenitCommutator zCom = new ZenitCommutator();
        zCom.setXD31On(true);
        zCom.setYD32On(true);
        zCom.setZD33On(false);
        zCom.setBarD11(75);
        zCom.setBarD12(35);
        zCom.setAngleD11(120);
        zCom.setAngleD12(255);

        zCommutatorService.save(zCom);
    }
}
