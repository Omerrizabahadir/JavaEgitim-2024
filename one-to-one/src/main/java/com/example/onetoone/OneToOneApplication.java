package com.example.onetoone;

import com.example.onetoone.model.Address;
import com.example.onetoone.model.Person;
import com.example.onetoone.model.repository.AddressRepository;
import com.example.onetoone.model.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		Person person=new Person();
		Address address=new Address();

		address.setCity("bursa");
		address.setStreet("hürriyet");

		person.setName("veli");
		person.setAddress(address);

	Person savePerson=personRepository.save(person);
		//deletePersonById();

		//deleteAllPerson();
		//deleteAllAddress();

	}
	public void deletePersonById(){
		personRepository.deleteById(11L);
	}
	public  void deleteAllPerson(){
		personRepository.deleteAll();
	}
	public  void deleteAllAddress(){
		addressRepository.deleteAll();
	}
}
