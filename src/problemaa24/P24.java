/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa24;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P24 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x=0,y=0;
        System.out.println("Teclea un numero");
        x=leer.nextInt();
        
       if (x >= 1) {
            for (int i = 1; i < (x + 1); i++) {
                if (x % i == 0) {
                    y++;
                }
            }

            if (y != 2) {
                System.out.println("El numero no es primo");
            } else {
                System.out.println("El numero si es primo");
            }
        
        
    }
            
}
}