package Aula.Ex2;

import java.util.Arrays;
import java.util.Random;

public class MaquinaDeVendas {
    private double[] valor = {10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
    private double[][]  maquina = new double[10][2];

    public MaquinaDeVendas(){
        criarStock();
    }

    public void setQnt(double valor, int qnt){
        for (int i = 0; i < maquina.length; i++) {
            if (maquina[i][0] == valor){
                maquina[i][1] = qnt;
            }
        }
    }

    public void troco(double troco){
        int divisao;
        int qntMoedas = 0;
        String strTroco = "Troco: " + troco + "\n";
        for (int i = 0; i < maquina.length; i++) {
            if (maquina[i][1] > 0){
                divisao = (int) (troco/maquina[i][0]);
                if (divisao < maquina[i][1]){
                    maquina[i][1] -= divisao;
                    qntMoedas += divisao;
                    troco -= divisao * maquina[i][0];
                    strTroco += "Moeda " + maquina[i][0] + "€ -> " + divisao + " unidades\n";
                }

            }
        }
        if (troco > 0.001){
            System.out.println("Nao tem troco para dar");
            criarStock();
        } else {
            System.out.println(strTroco + "Total de moedas: "+ qntMoedas);
        }

    }
    private void criarStock(){
        Random r = new Random();
        for (int i = 0; i < maquina.length; i++) {
            int qnt = r.nextInt(10, 30);
            maquina[i][0] = valor[i];
            maquina[i][1] = qnt;
        }
    }

    @Override
    public String toString() {
        return "MaquinaDeVendas{" +
                "maquina=" + Arrays.toString(new String[]{Arrays.deepToString(maquina)}) +
                '}';
    }

    public static void main(String[] args) {
        MaquinaDeVendas maquinaDeVendas = new MaquinaDeVendas();

        maquinaDeVendas.setQnt(5, 0);
        maquinaDeVendas.setQnt(10, 0);
        maquinaDeVendas.setQnt(0.02, 0);
        maquinaDeVendas.setQnt(0.01, 0);

        System.out.println(maquinaDeVendas);

        maquinaDeVendas.troco(3.85);

        System.out.println(maquinaDeVendas);

        maquinaDeVendas.setQnt(2, 0);
        maquinaDeVendas.setQnt(0.5, 0);

        maquinaDeVendas.troco(3.85);
        System.out.println(maquinaDeVendas);

        MaquinaDeVendas maquinaVazia = new MaquinaDeVendas();

        maquinaVazia.setQnt(10,0);
        maquinaVazia.setQnt(5,0);
        maquinaVazia.setQnt(2,0);
        maquinaVazia.setQnt(1,1);
        maquinaVazia.setQnt(0.5,2);
        maquinaVazia.setQnt(0.2,0);
        maquinaVazia.setQnt(0.1,0);
        maquinaVazia.setQnt(0.05,0);
        maquinaVazia.setQnt(0.02,0);
        maquinaVazia.setQnt(0.01,0);

        System.out.println(maquinaVazia);
        maquinaVazia.troco(2);
        System.out.println(maquinaVazia);

        maquinaVazia.troco(3.85);


    }

}
