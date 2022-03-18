package Aula.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private Value[] orderDeck;


    public Deck() {
        Value[] orderDeck = {Value.TWO, Value.TREE, Value.FOUR, Value.FIVE, Value.SIX, Value.SEVEN, Value.EIGHT,
        Value.NINE, Value.TEN, Value.JACK, Value.QUEEN, Value.KING, Value.ACE};

        Naipe[] orderNaipe = {Naipe.Diamonds, Naipe.Clubs, Naipe.Hearts, Naipe.Spades};

        deck = new ArrayList<>();
        for (Naipe naipe : orderNaipe) {
            for (int i = 2; i < orderDeck.length + 2; i++) {
                if (i == 11) {
                    deck.add(new Card(orderDeck[i - 2], naipe, orderDeck[i - 2].getValue()));
                } else if (i == 12) {
                    deck.add(new Card(orderDeck[i - 2], naipe, orderDeck[i - 2].getValue()));
                } else if (i == 13) {
                    deck.add(new Card(orderDeck[i - 2], naipe, orderDeck[i - 2].getValue()));
                } else if (i == 14) {
                    deck.add(new Card(orderDeck[i - 2], naipe, orderDeck[i - 2].getValue()));
                } else {
                    deck.add(new Card(orderDeck[i - 2], naipe, orderDeck[i - 2].getValue()));
                }
            }
        }

    }

    public Deck(ArrayList<Card> cards){
        deck = new ArrayList<>();
        deck.addAll(cards);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Value[] getOrderDeck() {
        return orderDeck;
    }

    public void setOrderDeck(Value[] orderDeck) {
        this.orderDeck = orderDeck;
    }

    public void addCard(Card card){
        deck.add(card);
    }

    public void removeCard(Card card){
        deck.remove(card);
    }

    public void shuffle(){
        Random number = new Random();
        int card;
        for (int i = 0; i < 200; i++) {
            Card temp;
            card = number.nextInt(52);
            temp = deck.get(card);
            deck.remove(temp);
            deck.add(temp);
        }
    }

    public void orderDeck(){
        Collections.sort(deck);
    }

    public void changeValueCard(Value valor, int weight){
        valor.setValue(weight);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }


}
