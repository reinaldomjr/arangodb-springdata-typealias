package com.hiveflow.idmmanager.domain;

import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.TypeAlias;

@Document("identity")
@TypeAlias("device")
public final class Device extends Identity {
    public Device(String deviceId) {
        this.deviceId = deviceId;
    }

    public String deviceId;
}
