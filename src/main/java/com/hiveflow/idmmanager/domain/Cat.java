package com.hiveflow.idmmanager.domain;

import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.TypeAlias;

@Document("animal")
@TypeAlias("cat")
public final class Cat extends Animal {
    public Cat(String catProperty) {
        this.catProperty = catProperty;
    }

    public String catProperty;
}
