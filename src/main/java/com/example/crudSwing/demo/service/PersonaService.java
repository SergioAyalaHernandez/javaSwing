package com.example.crudSwing.demo.service;

import com.example.crudSwing.demo.entity.PersonaEntity;

import java.util.List;

public interface PersonaService {
    List<PersonaEntity> getAllPerson();
    PersonaEntity getPersonById(Integer idPerson);
    PersonaEntity createPerson(PersonaEntity persona);
    PersonaEntity updatePerson(PersonaEntity persona);
    Boolean deletePerson(Long idPerson);
}
