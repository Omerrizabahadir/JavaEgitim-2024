package com.example.one_to_many_example2;

import com.example.one_to_many_example2.model.Match;
import com.example.one_to_many_example2.model.Team;
import com.example.one_to_many_example2.repository.MatchRepository;
import com.example.one_to_many_example2.repository.TeamRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class OneToManyExample2Application implements CommandLineRunner {

	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private MatchRepository matchRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExample2Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Team team = new Team();
		Match match = new Match();


		match.setMatchDate(LocalDate.of(2024, 05, 26));
		match.setLocation("Konya Belediye stadı");
		team.setHomeTeam("Konyaspor");
		match.setMatchName("Konyaspor-GS");
		team.setTeamName("KONYASPOR-");
		team.setTeamName("GS");
		match.setTeam(team);

		//teamRepository.save(team);
		//matchRepository.save(match);

		//findAllMatches();
		//findTeamAndMatchList();
		//deleteAllTeamById();
		//deleteAllMatchById();
		findByName("KONYASPOR");
	}

	public void findAllTeams() {
		teamRepository.findAll();

	}

	public void findAllMatches() {
		matchRepository.findAll();
	}

	public void deleteAllTeamById() {
		teamRepository.deleteAllById(Collections.singleton(10L));
	}

	public void deleteAllMatchById() {
		matchRepository.deleteAllById(Collections.singleton(15L));
	}

	public void findAllMatchById() {
		teamRepository.findAllById(Collections.singleton(12L));
	}

	private void findTeamAndMatchList() {
		Optional<Team> team = teamRepository.findById(2L);

		if (team.isPresent()) {
			team.ifPresent(System.out::println);
		}


	}
	public List<Team> findByName(String name){


        return teamRepository.findAll();
    }
}
