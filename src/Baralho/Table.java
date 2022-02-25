package Baralho;

public class Table {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.changeValueCard(Value.ACE, 1);

        System.out.println(deck);

        // Baralhar o deck

        deck.shuffle();

        deck.orderDeck();
        System.out.println(deck);

        System.out.println(deck.getDeck().get(51).getColor());
        System.out.println(deck.getDeck().get(51).getNaipe());
        System.out.println(deck.getDeck().get(51).getName());
        System.out.println(deck.getDeck().get(51).getValue());


        // Simulaçao de jogo Carta mais alta

        System.out.println("\n\n\n");
        Player player1 = new Player("Antunes");
        Player player2 = new Player("Vitor");

        player1.addCard(deck.getDeck().get(0));
        player2.addCard(deck.getDeck().get(1));

        GameHighCard game = new GameHighCard(player1, player2);

        System.out.println(player1.getCards().get(0).getValue());
        System.out.println(player2.getCards().get(0).getValue());

        System.out.println(game.whoWin());
    }
}
