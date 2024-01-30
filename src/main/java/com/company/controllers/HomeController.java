package com.company.controllers;

import com.company.models.*;
import com.company.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

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

    @GetMapping("/")
    public ResponseEntity<List<Optional<?>>> homeList() {
        Optional<Main> data1 = mainService.getById((long)1);
        Optional<NorthCommutator> data2 = nCommutatorService.getById((long)2);
        Optional<SouthCommutator> data3 = sCommutatorService.getById((long)3);
        Optional<NadirCommutator> data4 = ndCommutatorService.getById((long)4);
        Optional<ZenitCommutator> data5 = zCommutatorService.getById((long)5);

        List<Optional<?>> lst = List.of(data1, data2, data3, data4, data5);

        return ResponseEntity.ok(lst);
    }
}
