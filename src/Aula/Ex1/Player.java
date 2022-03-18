package Aula.Ex1;

import java.util.ArrayList;

public class Player {
    private String nome;
    private ArrayList<Card> cards;

    public Player(String nome) {
        cards = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card){
        cards.add(card);
    }
}
