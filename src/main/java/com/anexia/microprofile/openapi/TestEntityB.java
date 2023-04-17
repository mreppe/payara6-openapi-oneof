package com.anexia.microprofile.openapi;

import java.io.Serializable;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class TestEntityB implements Serializable {

    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

}
