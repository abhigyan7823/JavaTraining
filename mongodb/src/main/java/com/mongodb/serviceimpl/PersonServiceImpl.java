package com.mongodb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.collections.Person;
import com.mongodb.repo.PersonRepo;
import com.mongodb.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepo personRepo;

	@Override
	public String save(Person person) {
		return personRepo.save(person).getPersonId();
	}

}
