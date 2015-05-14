/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa33;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P33 {
    public static void main(String[] args) {
         String[] array = new String[20];
         Scanner leer=new Scanner(System.in);
         for (int i = 0; i <=19; i++) {
             System.out.println("Ingresa el nombre "+i+": ");
          array[i]=leer.next();
        }
         for (int c = 0; c <= 19; c++) {
             System.out.println("El nombre "+c+" Fue: "+array[c]);
        }
    }
  
}
