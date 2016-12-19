package com.company.Models;

public class Game {

    private Team hozyayeva, gosti;
    private int hozyayevaScore,gostiScore;
    private DateM gameDate;

    public Game(Team hozyayeva, Team gosti, int hozyayevaScore, int gostiScore, DateM gameDate) {
        this.hozyayeva = hozyayeva;
        this.gosti = gosti;
        this.hozyayevaScore = hozyayevaScore;
        this.gostiScore = gostiScore;
        this.gameDate = gameDate;
    }

    public Team getHozyayeva() {
        return hozyayeva;
    }

    public Team getGosti() {
        return gosti;
    }

    public int getHozyayevaScore() {
        return hozyayevaScore;
    }

    public int getGostiScore() {
        return gostiScore;
    }

    @Override
    public String toString() {
                return String.format("\n%s-%s %s:%s %s",hozyayeva.getName(),gosti.getName(),hozyayevaScore, gostiScore, gameDate.getDate());
    }
}
