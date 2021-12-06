package com.sunrise.seedling.model;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Seedler {

    private Integer id;

    @NotNull(message = "Name should not be null")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Name must be a string")
    private String name;

    @NotNull(message = "Role should be specified")
    private Role role;

    @NotNull(message = "Specify your group")
    private Group group;

    @NotNull(message = "Team should be specified")
    private Team team;

    @NotNull(message = "Location should not be empty")
    private String location;
    private String bio;

    public Seedler(Integer id, String name, Role role, Group group, Team team, String location, String bio) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.group = group;
        this.team = team;
        this.location = location;
        this.bio = bio;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Role getRole() {
        return role;
    }

    public Group getGroup() {
        return group;
    }

    public Team getTeam() {
        return team;
    }

    public String getLocation() {
        return location;
    }

    public String getBio() {
        return bio;
    }


}
