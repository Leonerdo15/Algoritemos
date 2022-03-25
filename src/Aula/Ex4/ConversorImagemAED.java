/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula.Ex4;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.io.IOException;

/**
 *
 * @author alexandrebarao
 */
public class ConversorImagemAED {

    private BufferedImage imagem;

    public ConversorImagemAED(String urlImagemOrigem) {

        try {
            imagem = ImageIO.read(new File(urlImagemOrigem));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void converteBW(String urlImagemDestino) {

        try {

            BufferedImage imagemBW = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

            for (int i = 0; i < imagem.getHeight(); i++) {
                for (int j = 0; j < imagem.getWidth(); j++) {

                    Color cor = new Color(imagem.getRGB(j, i));
                    imagemBW.setRGB(j, i, getCinza(cor).getRGB());
                }
            }

            ImageIO.write(imagemBW, "jpg", new File(urlImagemDestino));
            System.out.println("Imagem convertida para B&W");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void imagemComMargem(String urlImagemDestino, int margemPx, Color rgb){
        try {

            BufferedImage imagemCM = new BufferedImage(imagem.getWidth() + margemPx*2, imagem.getHeight() + margemPx * 2, BufferedImage.TYPE_INT_RGB);
            int x = 0;
            int y = 0;
            for (int i = 0; i < imagemCM.getHeight(); i++) {
                for (int j = 0; j < imagemCM.getWidth(); j++) {

                    if ((i > margemPx || i < imagem.getHeight()+margemPx) && (j > margemPx || j < imagem.getWidth() +margemPx)){
                        imagemCM.setRGB(j, i, imagem.getRGB(j -margemPx, i-margemPx));

                    } else {
                        imagemCM.setRGB(j, i, rgb.getRGB());
                    }


                }

            }

            ImageIO.write(imagemCM, "jpg", new File(urlImagemDestino));
            System.out.println("Imagem convertida para B&W");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void photomaton(String urlImagemDestino, int margem, Color rgb) {

        try {

            BufferedImage imagemBW = new BufferedImage(imagem.getWidth() * 2, imagem.getHeight() * 2, BufferedImage.TYPE_INT_RGB);

            for (int i = 0; i < imagem.getHeight(); i++) {
                for (int j = 0; j < imagem.getWidth(); j++) {

                    imagemBW.setRGB(j, i, imagem.getRGB(j, i));
                    imagemBW.setRGB(j + imagem.getWidth(), i, imagem.getRGB(j, i));
                    imagemBW.setRGB(j , i + imagem.getHeight(), imagem.getRGB(j, i));
                    imagemBW.setRGB(j + imagem.getWidth(), i + imagem.getHeight(), imagem.getRGB(j, i));
                }
            }

            ImageIO.write(imagemBW, "jpg", new File(urlImagemDestino));
            System.out.println("Imagem convertida para B&W");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Color getCinza(Color cor) {

        int r = (int) (cor.getRed() * 0.3);
        int g = (int) (cor.getGreen() * 0.59);
        int b = (int) (cor.getBlue() * 0.11);

        return new Color(r+g+b, r+g+b, r+g+b);
    }

    public boolean compararImangens(String url, int erro) {
        BufferedImage imagem1;

        int total = 0;

        try {
            imagem1 = ImageIO.read(new File(url));

            for (int i = 0; i < imagem1.getHeight(); i++) {
                for (int j = 0; j < imagem1.getWidth(); j++) {
                    if (imagem.getRGB(j,i) != imagem1.getRGB(j,i)){
                        total ++;
                    }
                    if (total > erro){
                        return false;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }


    public void rodarEsq(String urlDestino){

        BufferedImage imagemSave = new BufferedImage(imagem.getHeight(), imagem.getWidth(), BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < imagem.getHeight(); i++) {
            for (int j = 0; j < imagem.getWidth(); j++) {
                imagemSave.setRGB(i, imagem.getWidth() - j - 1, imagem.getRGB(j,i));
            }
        }

        try {
            ImageIO.write(imagemSave, "jpg", new File(urlDestino));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reverseInverterImagem(String urlDestino){
        BufferedImage imagemSave = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < imagem.getHeight(); i++) {
            for (int j = 0; j < imagem.getWidth(); j++) {
                imagemSave.setRGB(imagem.getWidth() - j - 1, imagem.getHeight() - i - 1, imagem.getRGB(j,i));
            }
        }

        try {
            ImageIO.write(imagemSave, "jpg", new File(urlDestino));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void inverterImagem(String urlDestino){
        BufferedImage imagemSave = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < imagem.getHeight(); i++) {
            for (int j = 0; j < imagem.getWidth(); j++) {
                imagemSave.setRGB(j, imagem.getHeight() - i - 1, imagem.getRGB(j,i));
            }
        }

        try {
            ImageIO.write(imagemSave, "jpg", new File(urlDestino));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void nsei(String urlDestino){
        BufferedImage imagemSave = new BufferedImage(imagem.getWidth(), imagem.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < imagem.getHeight(); i++) {
            for (int j = 0; j < imagem.getWidth(); j++) {
                imagemSave.setRGB(imagem.getWidth() - j - 1, i, imagem.getRGB(j,i));
            }
        }

        try {
            ImageIO.write(imagemSave, "jpg", new File(urlDestino));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
