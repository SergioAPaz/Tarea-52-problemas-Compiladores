/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa37;

import java.util.Random;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P37 {
    public static void main(String[] args) {
          int[][] arr= new int[4][5];
        Random rnd=new Random();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=(int)(rnd.nextDouble()* 100+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nFila "+(i+1));
           
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Columna "+(j+1)+"= "+arr[i][j]);
            }
        }
        System.out.println("Transpuesta: ");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println("\nFila "+(i+1));
           
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Columna "+(j+1)+"= "+arr[j][i]);
            }
        }
    }
}
