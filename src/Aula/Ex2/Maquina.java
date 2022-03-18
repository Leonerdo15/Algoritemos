package Aula.Ex2;

/**
 @author Bruno Mata
 */
import java.util.Scanner;

public class Maquina {

    private static final double[] m = new double[]{10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
    private static final double[] trc = new double[]{0,0,0,0,0,0,0,0,0,0};
    private static final double[] qtd = new double[]{3,4,8,15,20,10,40,20,150,250};

    public static void main(String []args){
        int i =0;
        while (i<2){
            Scanner sc = new Scanner(System.in);

            System.out.println("Insira um valor!:");
            double troco = sc.nextDouble();
            sc.nextLine();

            getMoedasTroco(troco);
            getMoedasExistentes(troco);
            System.out.println("O seu Troco:");
            printTroco();
            System.out.println("Moedas Ainda Existentes:");
            printMoedas();
            trc[i]=0;
            i++;

        }

    }



    private static void getMoedasTroco(double troco) {
        int i = 0;

        while(troco != 0.0) {

            if(troco - m[i] < 0) {
                i++;
            }else {
                troco -= m[i];
                troco = (double) Math.round(troco * 100) / 100;//meter com duas casas decimais
                trc[i]++;

            }
        }
    }

    private static void getMoedasExistentes(double ext) {
        int i = 0;

        while(ext != 0.0) {

            if(ext - m[i] < 0) {
                i++;
            }else {
                ext -= m[i];
                ext = (double) Math.round(ext * 100) / 100;//meter com duas casas decimais
                qtd[i]--;
            }
        }
    }

    private static void printTroco() {
        for(int i = 0; i < m.length; i++) {
            if(trc[i] == 0)
                continue;
            System.out.println(m[i] + "€: " + trc[i]);
        }

    }

    private static void printMoedas() {
        for(int i = 0; i < m.length; i++) {
            if(qtd[i] == 0)
                continue;
            System.out.println(m[i] + "€: " + qtd[i]);
        }

    }
}
