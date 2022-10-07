package me.chrisanabo.aop.logging.pojo;

import me.chrisanabo.aop.logging.annotation.Sensitivity;

import java.io.Serializable;


public class SimplePojo implements Serializable {

    private String name;


    @Sensitivity(name="name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}