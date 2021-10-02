package com.hiveflow.idmmanager.controller;

import com.hiveflow.idmmanager.domain.Cat;
import com.hiveflow.idmmanager.domain.Animal;
import com.hiveflow.idmmanager.domain.Dog;
import com.hiveflow.idmmanager.repository.AnimalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/animals")
public class Animals {

    private final AnimalRepository animalRepository;


    public Animals(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Animal>> findAll() {
        Iterable<Animal> all = animalRepository.findAll();

        List<Animal> result = StreamSupport.stream(all.spliterator(), false)
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(result);
    }


    @GetMapping("/populate")
    public ResponseEntity<List<Animal>> populate() {
        animalRepository.save(new Cat("A Cat"));
        animalRepository.save(new Dog("A Dog"));

        return findAll();
    }
}
