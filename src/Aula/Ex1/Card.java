package Aula.Ex1;

public class Card implements Comparable {
    private Naipe naipe;
    private Value name;
    private int value;


    public Card(Value name, Naipe naipe, int value) {
        this.naipe = naipe;
        this.name = name;
        this.value = value;
    }

    public Card() {

    }


    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Value getName() {
        return name;
    }

    public void setName(Value name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor(){
        return naipe.getColor();
    }

    public void changeCard(Card card){

    }


    @Override
    public String toString() {
        return name + " of " + naipe + "\n";
    }

    @Override
    public int compareTo(Object card) {
        int compareValue=((Card)card).getValue();
        /* For Ascending order*/
        return this.value-compareValue;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

}
