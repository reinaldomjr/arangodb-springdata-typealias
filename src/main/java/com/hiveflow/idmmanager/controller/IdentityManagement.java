package com.hiveflow.idmmanager.controller;

import com.hiveflow.idmmanager.domain.Device;
import com.hiveflow.idmmanager.domain.Identity;
import com.hiveflow.idmmanager.domain.Person;
import com.hiveflow.idmmanager.repository.IdentityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api/identities")
public class IdentityManagement {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final IdentityRepository identityRepository;


    public IdentityManagement(IdentityRepository identityRepository) {
        this.identityRepository = identityRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Identity>> findAll() {
        logger.info("Find all roles");
        Iterable<Identity> allRoles = identityRepository.findAll();

        allRoles.forEach(identity -> {
            System.out.println(identity.getClass().getName());
        });

        List<Identity> result = StreamSupport.stream(allRoles.spliterator(), false)
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(result);
    }


    @GetMapping("/populate")
    public ResponseEntity<List<Identity>> populate() {
        logger.info("Find all roles");

        identityRepository.save(new Device("deviceId"));
        identityRepository.save(new Person("personName"));

        return ResponseEntity.ok().body(new ArrayList<>());
    }
}
