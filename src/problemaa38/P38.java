/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa38;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P38 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Cursos disponibles: ");
        a = sc.nextInt();
        System.out.println("Alumnos en el curso: ");
        b = sc.nextInt();

        int A[][] = new int[a][b];
        int k = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Teclee la calificacion del "
                        + "alumno " + (k + 1) + " del curso " + (i + 1));
                A[i][j] = sc.nextInt();
                k++;
            }
            k = 0;
        }

        System.out.println("\n");
        for (int x = 0; x < a; x++) {
            System.out.print("|");
            for (int y = 0; y < b; y++) {
                System.out.print(A[x][y]);
                if (y != A[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
}
