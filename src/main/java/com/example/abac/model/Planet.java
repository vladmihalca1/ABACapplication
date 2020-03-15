package com.example.abac.model;


public class Planet {
    private String name;
    private String description;
    private String status;
    private int robots;

    public Planet(String name, String description, String status, int robots) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.robots = robots;
    }

    public Planet() { }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public int getRobots() {
        return robots;
    }

}
