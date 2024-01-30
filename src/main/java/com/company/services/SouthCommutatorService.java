package com.company.services;

import com.company.models.SouthCommutator;
import com.company.repositories.SouthCommutatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SouthCommutatorService {

    @Autowired
    private SouthCommutatorRepository commutatorRepository;

    public Optional<SouthCommutator> getById(Long id){
        return commutatorRepository.findById(id);
    }

    public List<SouthCommutator> getAll(){
        return commutatorRepository.findAll();
    }

    public SouthCommutator save(SouthCommutator commutator){
        return commutatorRepository.save(commutator);
    }

    public void delete(SouthCommutator commutator){
        commutatorRepository.delete(commutator);
    }
}
