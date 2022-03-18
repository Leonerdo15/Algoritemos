/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula.Ex4;

/**
 *
 * @author alexandrebarao
 */
public class JavaApplication_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ConversorImagemAED minhaImagem = new ConversorImagemAED("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\bb.jpg");
        minhaImagem.converteBW("C:\\Users\\leona\\Documents\\Algoritemos\\src\\Aula\\Ex4\\imagens\\bbBW.jpg");
       
        // ./src/aula/ex4/imagens/xxxxxxxx.png
    }
    
}
