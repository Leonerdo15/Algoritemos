package Aula.Ex3;

import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {
        EuroMilhoes euroMilhoes = new EuroMilhoes();

        euroMilhoes.vizulaizarNumerosDaSorte();

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> estrelas = new ArrayList<>();

        numeros.add(2);
        numeros.add(23);
        numeros.add(1);
        numeros.add(12);
        numeros.add(3);

        estrelas.add(4);
        estrelas.add(3);

        euroMilhoes.apostar(numeros, estrelas);

    }
}
