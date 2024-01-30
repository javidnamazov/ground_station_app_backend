package com.company.repositories;

import com.company.models.ZenitCommutator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZenitCommutatorRepository extends JpaRepository<ZenitCommutator,Long> {
}
