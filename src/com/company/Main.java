package com.company;

import com.company.Models.Player;
import com.company.Models.Team;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        List<Player> players = new ArrayList<>();

        while(true) {
            switch (Input.String("команду").toLowerCase()) {
                case "init":
                    teams=Manager.GenerateAll();
                    for (Team t:teams) players.addAll(t.getPlayers());
                    break;
                case "makecompetition":
                    if (teams.size()==0) break;
                    System.out.println("\n======Winner======\n"+Manager.MakeCompetition( teams));
                    break;
                case "moveplayer" : Manager.transfer(
                            findPlayer(players,Input.String("name")),
                            findTeam(teams,Input.String("teamName"))
                    );break;
                case "addPlayer":
                    Team t = findTeam(teams,"team");
                    Player np = new Player(Input.String("name"),t);
                    t.addPlayer(np);
                    break;
                default:
                    System.out.println("Доступні команди: nit, makecompetition, moveplayer");break;
            }
        }
    }
    static Team findTeam (List<Team> g,String name){
        for (Team o:g) {
            if (o.equals(name))return o;
        }return null;
    }
    static Player findPlayer (List<Player> g,String name){
        for (Player o:g) {
            if (o.equals(name))return o;
        }return null;
    }
}
