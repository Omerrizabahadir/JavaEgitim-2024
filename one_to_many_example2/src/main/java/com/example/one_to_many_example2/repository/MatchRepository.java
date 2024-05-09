package com.example.one_to_many_example2.repository;

import com.example.one_to_many_example2.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
