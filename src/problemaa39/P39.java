/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa39;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P39 {
    public static void main(String[] args) {
        
         int fil, col;
        Scanner esc = new Scanner(System.in);
        System.out.println("Numero de filas: ");
        fil = esc.nextInt();
        System.out.println("Numero de Columnas: ");
        col = esc.nextInt();
        int[][] ord = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Teclee un numero");
                ord[i][j] = esc.nextInt();
            }
        }
        P39 prob = new P39();
        int[][] ord2 = prob.ordenarInsercion(ord);
        for (int i = 0; i < ord2.length; i++) {
            for (int j = 0; j < ord2[0].length; j++) {
                System.out.print(ord2[i][j]);
                if (j != ord2[i].length-1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }
    public int[][] ordenarInsercion(int[][] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                aux = array[i][j];
                for (int a = j - 1; a >= 0 && array[i][a] > aux; a--) {
                    array[i][a + 1] = array[i][a];
                    array[i][a] = aux;
                }
            }
        }
        return array;
    }
    }
