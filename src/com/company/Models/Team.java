package com.company.Models;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players = new ArrayList<>();
    private List<Game> games = new ArrayList<>();
    private List<Transfer> transfers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, List<Player> players, List<Game> games) {
        this.name = name;
        this.players = players;
        this.games = games;
    }

    public void removePlayer(String name){
        for (int i=0;i<players.size();i++){
             if (players.get(i).getName().equalsIgnoreCase(name)) {
                 players.remove(i);
                 break;
             }
        }
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void addTransfer(Transfer transfer){
        this.transfers.add(transfer);
    }

    public void addGame(Game game){
        this.games.add(game);
    }

    public boolean equals(String str) {
        return name.equalsIgnoreCase(str);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Game> getGames() {
        return games;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("\nTeam:\n %s\nPlayers:%s\nGames:\n %s\nTransfers:%s", name,players.toString(),games.toString(),transfers.toString());
    }
}
