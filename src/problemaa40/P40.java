/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa40;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P40 {
    public static void main(String[] args) {
        
          int[][][] x= new int[3][4][5];
        int num=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) 
                {
                    x[i][j][k]=num++;
                }
                }
    }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("\nFila "+(j+1));
             
                for (int k = 0; k < 5; k++) {
                    System.out.println("Columna "+(k+1));
                    System.out.println("Valor "+x[i][j][k]);
        }
            }
      }
    }
    
}