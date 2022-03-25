/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula.Ex4;

import java.awt.*;

/**
 *
 * @author alexandrebarao
 */
public class JavaApplication_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ConversorImagemAED minhaImagem = new ConversorImagemAED("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\img\\foto.png");
//        minhaImagem.converteBW("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoBW.jpg");
//
//        if (minhaImagem.compararImangens("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoBW.jpg", 20)){
//            System.out.println("Sao iguais");
//        }else {
//            System.out.println("nao sao iguais");
//        }
//
//        minhaImagem.rodarEsq("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq1.jpg");
//
//        ConversorImagemAED minhaImagem1 = new ConversorImagemAED("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq1.jpg");
//
//        minhaImagem1.rodarEsq("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq2.jpg");
//
//        ConversorImagemAED minhaImagem2 = new ConversorImagemAED("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq2.jpg");
//
//        minhaImagem2.rodarEsq("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq3.jpg");
//
//        ConversorImagemAED minhaImagem3 = new ConversorImagemAED("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq3.jpg");
//
//        minhaImagem3.rodarEsq("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoEsq4.jpg");

//        minhaImagem.reverseInverterImagem("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoReverseInvert.jpg");
//
//        minhaImagem.inverterImagem("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoInvert.jpg");
//
//        minhaImagem.nsei("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\logoInvertVertical.jpg");

//        minhaImagem.photomaton("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\img\\quatroUm.jpg");

        minhaImagem.imagemComMargem("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\img\\margem.jpg", 1000, Color.BLACK);

    }
    
}
