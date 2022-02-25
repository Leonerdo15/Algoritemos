package Baralho;

import java.util.ArrayList;

public class Poker {
    private static Deck deck;
    private ArrayList<Player> players;

    public Poker(ArrayList<Player> players) {
        deck = new Deck();
        deck.shuffle();
        this.players = players;


    }

    public void play(){
        for (int i = 0; i < 2; i++) {
            for (Player player: players) {
                player.addCard(deck.getDeck().get(0));
                deck.removeCard(deck.getDeck().get(0));
            }
        }

        for (Player player: players) {
            System.out.println("" + player.getNome() + " -> "+ player.getCards() + "\n");
        }

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
