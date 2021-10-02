package com.hiveflow.idmmanager.domain;

import org.springframework.data.annotation.Id;

sealed public abstract class Animal permits Cat, Dog {
    @Id
    public String id;
}
