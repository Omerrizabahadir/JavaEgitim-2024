package com.example.one_to_one_example;

import com.example.one_to_one_example.model.House;
import com.example.one_to_one_example.model.Owner;
import com.example.one_to_one_example.model.repository.HouseRepository;
import com.example.one_to_one_example.model.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneExampleApplication implements CommandLineRunner {

	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	HouseRepository houseRepository;


	public static void main(String[] args) {
		SpringApplication.run(OneToOneExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner=new Owner();
		House house=new House();
		owner.setOwnerName("ali");
		owner.setHouse(house);

		house.setOwner(owner);
		house.setNoOfFloor(3);
		house.setNoOfBedroom(3);
		house.setArea("çankaya");

		Owner saveOwner=ownerRepository.save(owner);

		//deleteownerById();


	}
	public void deleteownerById(){
		ownerRepository.deleteById(1L);

	}
}
