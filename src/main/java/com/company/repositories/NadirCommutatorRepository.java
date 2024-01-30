package com.company.repositories;

import com.company.models.NadirCommutator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NadirCommutatorRepository extends JpaRepository<NadirCommutator,Long> {
}
