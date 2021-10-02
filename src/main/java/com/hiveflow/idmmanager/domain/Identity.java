package com.hiveflow.idmmanager.domain;

import org.springframework.data.annotation.Id;

sealed public abstract class Identity permits Device, Person {
    @Id
    public String id;
}
