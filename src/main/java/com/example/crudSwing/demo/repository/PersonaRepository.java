package com.example.crudSwing.demo.repository;

import com.example.crudSwing.demo.entity.PersonaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PersonaRepository extends ListCrudRepository<PersonaEntity, Long> {

}
