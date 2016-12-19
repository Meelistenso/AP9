package com.company.Models;

public class Transfer {

    private Team from;
    private Team to;
    private Player player;
    private DateM transferDate;

    public Transfer(Team from, Team to, Player player, DateM transferDate) {
        this.from = from;
        this.to = to;
        this.player = player;
        this.transferDate = transferDate;
    }

    @Override
    public String toString() {
        return String.format("\n"+(from!=null?"From "+from.getName():"") + " To %s, player:%s at %s",to.getName(),player.getName(),transferDate.getDate());
    }
}
