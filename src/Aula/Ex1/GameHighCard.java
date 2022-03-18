package Aula.Ex1;

public class GameHighCard {
    private Player player1;
    private Player player2;

    public GameHighCard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public String whoWin(){
        if (player1.getCards().get(0).getValue() > player2.getCards().get(0).getValue()){
            return player1.getNome();
        } else {
            return player2.getNome();
        }
    }
}
