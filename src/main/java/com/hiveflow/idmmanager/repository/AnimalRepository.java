package com.hiveflow.idmmanager.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.hiveflow.idmmanager.domain.Animal;

public interface AnimalRepository extends ArangoRepository<Animal, String> {
}
