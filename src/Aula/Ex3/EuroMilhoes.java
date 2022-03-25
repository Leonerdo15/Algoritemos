package Aula.Ex3;

import java.util.ArrayList;
import java.util.Random;

public class EuroMilhoes {
    private boolean[] numerosDaSorte = new boolean[50];
    private boolean[] estrelasDaSorte = new boolean[12];
    Random rand = new Random();

    public EuroMilhoes() {
        geradorRandom(50, numerosDaSorte, 5);
        geradorRandom(12, estrelasDaSorte, 2);
    }

    public void apostar(ArrayList<Integer> numeros, ArrayList<Integer> estrelas){

        // Vereficar se exitem 5 numeros e duas estrelas
        assert numeros.size() > 6 : "Faltam estrelas";
        assert estrelas.size() > 3 : "Faltam estrelas";

        assert numeros.size() < 6 : "Muitos numeros";
        assert estrelas.size() < 3 : "Muitas estrelas";

        int countNumeros = 0;
        int countEstreals = 0;

        // Ver quantos numeros e estrelas foram acertados
        countNumeros = getCount(numeros, countNumeros, numerosDaSorte);

        countEstreals = getCount(estrelas, countEstreals, estrelasDaSorte);

        System.out.println("Numeros certas: " + countNumeros + "\n Estrelas certas: " + countEstreals);



    }

    public int getCount(ArrayList<Integer> numeros, int countNumeros, boolean[] numerosDaSorte) {
        // precorrer os numeros todos
        for (int i = 0; i < numerosDaSorte.length; i++) {
            // ver se o numero esta como true, ou seja, e o numero da sorte
            if (numerosDaSorte[i]){
                //  precorrer os numeros escolhidos e ver e igual ao numero da sorte
                for (Integer numero : numeros) {
                    if (i + 1 == numero) {
                        countNumeros++;
                        break;
                    }
                }
            }
        }
        return countNumeros;
    }

    public void geradorRandom(int bound, boolean[] arrayNumeros, int qnt){

        // Escolher uma posiçao do array para passar para true
        int apontadorNumero = rand.nextInt(bound);
        arrayNumeros[apontadorNumero] = true;

        for (int i = 0; i < qnt-1; i++) {
            //Escolher a posiçao nova
            apontadorNumero = rand.nextInt(bound);

            // ver se ela ja foi mudada
            while (arrayNumeros[apontadorNumero]){
                apontadorNumero = rand.nextInt(bound);
            }

            arrayNumeros[apontadorNumero] = true;
        }
    }

    public String vizualizarNumeros(String str, boolean[] arrayNumeros){
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i]){
                str += i + 1 + ", ";
            }
        }
        return str;
    }

    public void vizulaizarNumerosDaSorte(){
        String numerosDaSorteStr = "";
        String estrelasDaSorteStr = "";

        numerosDaSorteStr = vizualizarNumeros(numerosDaSorteStr, numerosDaSorte);
        estrelasDaSorteStr = vizualizarNumeros(estrelasDaSorteStr, estrelasDaSorte);

        System.out.println(numerosDaSorteStr);
        System.out.println(estrelasDaSorteStr);
    }

}
