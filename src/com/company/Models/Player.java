package com.company.Models;

public class Player {
    private String name;
    private Team team;

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }
    public boolean equals(String str) {
        return name.equalsIgnoreCase(str);
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return ("\n "+name);
    }
}
