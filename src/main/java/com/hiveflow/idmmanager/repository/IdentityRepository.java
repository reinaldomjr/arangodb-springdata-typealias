package com.hiveflow.idmmanager.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.hiveflow.idmmanager.domain.Identity;

public interface IdentityRepository extends ArangoRepository<Identity, String> {
}
