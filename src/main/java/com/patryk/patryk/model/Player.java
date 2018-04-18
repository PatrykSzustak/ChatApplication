package com.patryk.patryk.model;

public class Player {

    private Integer id;
    private String name;
    private String surname;
    private String teamName;

    public Player(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Player(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public Player(Integer id, String name, String surname, String teamName) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
