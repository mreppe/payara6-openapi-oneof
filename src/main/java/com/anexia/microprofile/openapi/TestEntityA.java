package com.anexia.microprofile.openapi;

import java.io.Serializable;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema
public class TestEntityA implements Serializable {

    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

}
