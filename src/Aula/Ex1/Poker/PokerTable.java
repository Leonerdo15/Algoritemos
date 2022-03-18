package Aula.Ex1.Poker;

import Aula.Ex1.Player;

import java.util.ArrayList;

public class PokerTable {
    public static void main(String[] args) {
        Player player1 = new Player("Leonardo");
        Player player2 = new Player("Felipe");

        ArrayList<Player> players = new ArrayList<>();

        players.add(player1);
        players.add(player2);

        Poker poker = new Poker(players);

        poker.play();

    }
}
