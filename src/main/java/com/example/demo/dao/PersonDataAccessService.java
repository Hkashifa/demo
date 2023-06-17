package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.example.demo.dao.FakePersonDataAccessService.DB;

@Repository("fakedao")
public abstract class PersonDataAccessService implements PersonDao  {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int insertPerson(Person person) {
        return PersonDao.super.insertPerson(person);
    }


    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Person> selectAllPerson() {
        return null;
    }

    //@Override
    //public Optional<Person> selectPersonId(UUID id) {
    //    return Optional.empty();
  //  }

//    @Override
//    public int deletePersonById(UUID id) {
//        return 0;
//    }
//
//    @Override
//    public int updatePersonById(UUID id, Person person) {
//        return 0;
//    }
}
