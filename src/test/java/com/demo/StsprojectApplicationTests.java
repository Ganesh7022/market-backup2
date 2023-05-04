package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.marriage;
import com.demo.repository.marriageRepository;

@SpringBootTest
class StsprojectApplicationTests {
	@Autowired
	private marriageRepository MarriageRepository;

	@Test
	void saveOneMarriagej() {
		marriage m = new marriage();
		m.setName("sanjay");
		m.setGender("male");
		m.setStatus("married");
		
		MarriageRepository.save(m);
	}
	@Test
	void Delete() {
		MarriageRepository.deleteById(1L);
	}
	@Test
	void UpdateMarriage() {
		marriage m = new marriage();
		m.setId(6l);
		m.setName("supriya");
		m.setGender("Female");
		m.setStatus("Unmarried");
		
		MarriageRepository.save(m);
	}
	@Test
	void readById() {
		Optional<marriage> findById = MarriageRepository.findById(3L);
		marriage m = findById.get();
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getGender());
		System.out.println(m.getStatus());
	}

}
