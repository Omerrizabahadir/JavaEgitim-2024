package com.example.one_to_one_example.model.repository;

import com.example.one_to_one_example.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
