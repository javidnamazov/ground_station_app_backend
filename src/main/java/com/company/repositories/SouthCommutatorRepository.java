package com.company.repositories;

import com.company.models.SouthCommutator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthCommutatorRepository extends JpaRepository<SouthCommutator,Long> {
}
