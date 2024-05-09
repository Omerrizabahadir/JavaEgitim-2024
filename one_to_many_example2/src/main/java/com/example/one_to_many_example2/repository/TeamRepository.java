package com.example.one_to_many_example2.repository;

import com.example.one_to_many_example2.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
