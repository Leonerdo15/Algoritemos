package Aula.Ex1.Poker;

import Aula.Ex1.Deck;
import Aula.Ex1.Player;

import java.util.ArrayList;

public class Poker {
    private static Deck deck;
    private ArrayList<Player> players;

    public Poker(ArrayList<Player> players) {

        assert players.size() > 1 : "Tem que haver mais que um jogador";
        assert players.size() < 6 : "So pode ter 5 jogadores no maximo";

        deck = new Deck();
        deck.shuffle();
        this.players = players;


    }

    public void play(){
        Deck cardsGame = new Deck();
        cardsGame.getDeck().removeAll(cardsGame.getDeck());

        // add card for all players
        for (int i = 0; i < 2; i++) {
            for (Player player: players) {
                player.addCard(deck.getDeck().get(0));
                deck.removeCard(deck.getDeck().get(0));
            }
        }

        for (Player player: players) {
            System.out.println("" + player.getNome() + " -> "+ player.getCards() + "\n");
        }

        // add card for table
        for (int i = 0; i < 5; i++) {
            cardsGame.addCard(deck.getDeck().get(0));
            deck.removeCard(deck.getDeck().get(0));
        }

        System.out.println(cardsGame);


        resetDeck();
        for (Player player: players) {
            player.getCards().removeAll(player.getCards());
        }
    }

    public void resetDeck(){
        deck = new Deck();
        deck.shuffle();
    }

//    public int getPlayerHand(){
//
//    }

    public static Deck getDeck() {
        return deck;
    }

    public static void setDeck(Deck deck) {
        Poker.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
