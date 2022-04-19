package com.example.likaihua;

public class Users {
    private String name;
    private int id;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Users(String name, int id, String age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
