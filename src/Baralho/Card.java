package Baralho;

public class Card {
    private Naipe naipe;
    private Valor name;
    private int value;


    public Card(Valor name,Naipe naipe, int value) {
        this.naipe = naipe;
        this.name = name;
        this.value = value;
    }


    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getName() {
        return name;
    }

    public void setName(Valor name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCor(){
        if(naipe.equals(Naipe.Hearts) || naipe.equals(Naipe.Diamonds)){
            return "Red";
        } else {
            return "Black";
        }
    }


    @Override
    public String toString() {
        return "Card{" +
                "naipe=" + naipe +
                ", name=" + name +
                ", value=" + value +
                '}' + "\n";
    }
}
