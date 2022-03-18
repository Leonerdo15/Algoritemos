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

    private Color getCinza(Color cor) {

        int r = (int) (cor.getRed() * 0.3);
        int g = (int) (cor.getGreen() * 0.59);
        int b = (int) (cor.getBlue() * 0.11);

        return new Color(r+g+b, r+g+b, r+g+b);
    }

}
