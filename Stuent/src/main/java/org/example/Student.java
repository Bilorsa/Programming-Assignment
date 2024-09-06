package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String id;
    private String name;
    private String age;
    private String email;
    private String course;


    public Student(String id, String name, String age, String email,String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    // Information is pulled then set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Email: " + email + " , Course: " + course;
    }
}


