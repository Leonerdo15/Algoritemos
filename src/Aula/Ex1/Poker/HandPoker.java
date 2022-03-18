package Aula.Ex1.Poker;

import Aula.Ex1.Deck;

public enum HandPoker {
    HIGH_CARD(1),
    ONE_PAIR(2),
    TWO_PAIR(3),
    TREE_OF_A_KIND(4),
    STRAIGHT(5),
    FLUSH(6),
    FULL_HOUSE(7),
    FOUR_OF_A_KIND(8),
    STRAIGHT_FLUSH(9),
    ROYAL_FLUSH(10);

    private int value;

    HandPoker(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isPair(Deck deck){
        int sameNumber;

        for (int i = 0; i < deck.getDeck().size(); i++) {

        }

        return true;
    }
}
