package com.company;

import com.company.Models.*;
import java.util.*;
import static java.lang.Math.log;

public class Manager {

    public static List<Team> GenerateAll(){

        final List<Team> teams = new ArrayList<>();
        int count = Input.IntExp2("множитель колличества команд");
        for (int i=0;i<count;i++){
            teams.add(new Team(Input.RandomString(3)));
        }

        List<Player> players = new ArrayList<>();
        for (int i=0;i<teams.size()*11;i++){
            players.add(new Player(Input.RandomString(6)));
        }

        for (int i=0;i<teams.size();i++){
            for (int j=0;j<11;j++){
                Manager.transfer(players.get((i*11)+j),teams.get(i));
                players.get((i*11)+j).setTeam(teams.get(i));
            }
        }
        System.out.println("Сгенерировано:"+teams);
        return teams;
    }

    static List<Team> MakeCompetition(List<Team> teams){
        int i=0;boolean go=true;
        List nextTour=new ArrayList();
        if (teams.size()==1) return teams;else
        {
            System.out.printf("\n\n-------Place:%s-------\n",((int)(log(teams.size())/log(2))));
            while (i<teams.size()){
                go=true;
                while (go){
                makeGame(teams.get(i), teams.get(i+1));
                go=(
                        (teams.get(i)).getGames().get((teams.get(i)).getGames().size()-1).getHozyayevaScore()
                                ==(teams.get(i)).getGames().get((teams.get(i)).getGames().size()-1).getGostiScore());
                }
                nextTour.add(
                        (teams.get(i)).getGames().get((teams.get(i)).getGames().size()-1)
                                .getHozyayevaScore()
                                > (teams.get(i)).getGames().get((teams.get(i)).getGames().size()-1)
                                .getGostiScore()
                                ? teams.get(i)
                                : teams.get(i + 1));
                System.out.print((teams.get(i)).getGames().get((teams.get(i)).getGames().size()-1));
                i+=2;
            }
        }return MakeCompetition(nextTour);
    }

    static void makeGame (Team team1,Team team2){
        DateM date=new DateM();
        date.now();
        Game game=new Game(team1,team2,Input.RandomInt(10),Input.RandomInt(10),date);
        team1.addGame(game);
        team2.addGame(game);
    }

    static void transfer(Player player, Team team){
        DateM date=new DateM();
        date.now();

        Transfer transfer = new Transfer(( player).getTeam(), team,player,date);
        if ((player).getTeam()!=null) {
            (player).getTeam().addTransfer(transfer);
            (player).getTeam().removePlayer((player).getName());
        }
        (team).addTransfer(transfer);
        (team).addPlayer(player);
    }
}
