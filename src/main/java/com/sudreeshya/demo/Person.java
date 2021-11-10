package com.sudreeshya.demo;

import java.util.List;

public class Person {
    private Long id;
    private String name;
    private Integer age;
    private List<String> nickNames;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(List<String> nickNames) {
        this.nickNames = nickNames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nickNames=" + nickNames +
                '}';
    }
}
