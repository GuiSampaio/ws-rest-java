package com.desafio.icarros.desafio.entity;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum Units {
    KPH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case KPH: return "kph";
        }
        return null;
    }

    @JsonCreator
    public static Units forValue(String value) throws IOException {
        if (value.equals("kph")) return KPH;
        throw new IOException("Cannot deserialize Units");
    }
}
