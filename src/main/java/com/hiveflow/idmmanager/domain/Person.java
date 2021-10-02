package com.hiveflow.idmmanager.domain;

import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.TypeAlias;

@Document("identity")
@TypeAlias("person")
public final class Person extends Identity {
    public Person(String name) {
        this.name = name;
    }

    public String name;
}
