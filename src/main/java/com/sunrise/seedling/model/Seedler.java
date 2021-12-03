package com.sunrise.seedling.model;

import org.springframework.data.annotation.Id;

public class Seedler {

    private Long id;
    private String name;
    private String role;
    private String group;
    private String team;
    private String location;
    private String bio;


    public Seedler(Long id, String name, String role, String group, String team, String location, String bio) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.group = group;
        this.team = team;
        this.location = location;
        this.bio = bio;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getRole() {
        return role;
    }

    public String getGroup() {
        return group;
    }

    public String getTeam() {
        return team;
    }

    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }


}
