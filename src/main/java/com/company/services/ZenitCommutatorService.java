package com.company.services;

import com.company.models.ZenitCommutator;
import com.company.repositories.ZenitCommutatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZenitCommutatorService {

    @Autowired
    private ZenitCommutatorRepository commutatorRepository;

    public Optional<ZenitCommutator> getById(Long id){
        return commutatorRepository.findById(id);
    }

    public List<ZenitCommutator> getAll(){
        return commutatorRepository.findAll();
    }

    public ZenitCommutator save(ZenitCommutator commutator){
        return commutatorRepository.save(commutator);
    }

    public void delete(ZenitCommutator commutator){
        commutatorRepository.delete(commutator);
    }
}
