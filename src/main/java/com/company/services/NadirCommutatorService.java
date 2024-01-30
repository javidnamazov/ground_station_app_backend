package com.company.services;

import com.company.models.NadirCommutator;
import com.company.repositories.NadirCommutatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NadirCommutatorService {

    @Autowired
    private NadirCommutatorRepository commutatorRepository;

    public Optional<NadirCommutator> getById(Long id){
        return commutatorRepository.findById(id);
    }

    public List<NadirCommutator> getAll(){
        return commutatorRepository.findAll();
    }

    public NadirCommutator save(NadirCommutator commutator){
        return commutatorRepository.save(commutator);
    }

    public void delete(NadirCommutator commutator){
        commutatorRepository.delete(commutator);
    }
}
