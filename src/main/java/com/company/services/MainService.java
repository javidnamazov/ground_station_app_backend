package com.company.services;

import com.company.models.Main;
import com.company.repositories.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public Optional<Main> getById(Long id){
        return mainRepository.findById(id);
    }

    public List<Main> getAll(){
        return mainRepository.findAll();
    }

    public Main save(Main main){
        return mainRepository.save(main);
    }

    public void delete(Main main){
        mainRepository.delete(main);
    }
}
