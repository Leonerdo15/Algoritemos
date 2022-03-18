package Aula.Ex1;

public enum Naipe {
    Diamonds("Red"),
    Spades("Black"),
    Clubs("Black"),
    Hearts("Red");

    private String color;

    Naipe(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
