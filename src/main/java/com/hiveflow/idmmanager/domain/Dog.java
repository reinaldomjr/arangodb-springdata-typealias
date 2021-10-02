package com.hiveflow.idmmanager.domain;

import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.TypeAlias;

@Document("animal")
@TypeAlias("dog")
public final class Dog extends Animal {
    public Dog(String dogProperty) {
        this.dogProperty = dogProperty;
    }

    public String dogProperty;
}
