package Baralho;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deck;
    private Valor[] orderDeck;
    private Naipe[] orderNaipe;

    public Deck() {
        Valor[] orderDeck = {Valor.TWO, Valor.TREE, Valor.FOUR, Valor.FIVE, Valor.SIX, Valor.SEVEN, Valor.EIGHT,
        Valor.NINE, Valor.TEN, Valor.JACK, Valor.QUEEN, Valor.KING, Valor.ACE};

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

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Valor[] getOrderDeck() {
        return orderDeck;
    }

    public void setOrderDeck(Valor[] orderDeck) {
        this.orderDeck = orderDeck;
    }


    public void Shuffle(){
        Random number = new Random();

        int card;
        for (int i = 0; i < 1000; i++) {
            Card temp;
            card = number.nextInt(52);
            temp = deck.get(card);
            deck.remove(temp);
            deck.add(temp);
        }
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
