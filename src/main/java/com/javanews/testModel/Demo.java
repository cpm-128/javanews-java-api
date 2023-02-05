package com.javanews.testModel;

import java.util.Objects;

public class Demo {
    private String name;
    private int age;

//    Constructor
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

//    overriding the default hash code so values are compared instead
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // override the default toString behavior in order to see objects' value
    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
