package com.example.one_to_one_example.model.repository;

import com.example.one_to_one_example.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {

}
