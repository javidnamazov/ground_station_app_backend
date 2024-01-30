package com.company.repositories;

import com.company.models.NorthCommutator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NorthCommutatorRepository extends JpaRepository<NorthCommutator,Long> {
}
