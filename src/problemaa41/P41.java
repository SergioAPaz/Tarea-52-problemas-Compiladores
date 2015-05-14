/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa41;

import java.util.Random;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P41 {
    public static void main(String[] args) {
        double[][][] arrmul= new double[5][10][20];
        double notCur, notCent, media;
        double mediCent;
        Random rnd= new Random();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 20; k++) {
                    arrmul[i][j][k]=(int)(rnd.nextDouble()*10+5);
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            notCent=0;
            System.out.println("\nCentro "+(i+1));
            System.out.println("----------------");
            for (int j = 0; j < 10; j++) {
                notCur=0;
                System.out.println("\nCurso "+(j+1));
                              for (int k = 0; k < 20; k++) {
                    System.out.println("Materia "+(k+1));
                    System.out.println("Valor "+arrmul[i][j][k]);
                    notCur=notCur + arrmul[i][j][k];
                }
                media=notCur/20;
                System.out.println("\nMedia de Curso "+(j+1)+" es "+media);
                notCent=notCent+media;
            }
            mediCent=notCent/10;
            System.out.println("Media de centro "+(i+1)+" es "+mediCent);
        }
    }
}
