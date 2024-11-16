package com.example.crudSwing.demo.service.impl;

import com.example.crudSwing.demo.entity.PersonaEntity;
import com.example.crudSwing.demo.excepciones.BadRequestException;
import com.example.crudSwing.demo.repository.PersonaRepository;
import com.example.crudSwing.demo.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
@Service
@RequiredArgsConstructor
public class PersonaServiceImpl implements PersonaService {

    private final PersonaRepository personaRepository;


    @Override
    public List<PersonaEntity> getAllPerson() {
        return personaRepository.findAll();
    }

    @Override
    public PersonaEntity getPersonById(Integer idPerson) {
        return personaRepository.findById(Long.valueOf(idPerson)).orElse(null);
    }

    @Override
    public PersonaEntity createPerson(PersonaEntity persona) {
        return personaRepository.save(persona);
    }

    @Override
    public PersonaEntity updatePerson(PersonaEntity persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Boolean deletePerson(Long idPerson) {
        personaRepository.deleteById(idPerson);
        return true;
    }
}
