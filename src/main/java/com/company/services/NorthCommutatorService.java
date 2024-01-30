package com.company.services;

import com.company.models.NorthCommutator;
import com.company.repositories.NorthCommutatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NorthCommutatorService {

    @Autowired
    private NorthCommutatorRepository commutatorRepository;

    public Optional<NorthCommutator> getById(Long id){
        return commutatorRepository.findById(id);
    }

    public List<NorthCommutator> getAll(){
        return commutatorRepository.findAll();
    }

    public NorthCommutator save(NorthCommutator commutator){
        return commutatorRepository.save(commutator);
    }

    public void delete(NorthCommutator commutator){
        commutatorRepository.delete(commutator);
    }
}
