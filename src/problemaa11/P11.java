/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa11;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P11 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x=0,y=0;
        System.out.println("Ingrese un numero: ");
        x=leer.nextInt();
        for (int i=0; i<=x; i++) {
            if(i%3==0 && i!=0)
            {
                System.out.println("Los multiplos son "+i);
                y++;
            }
            
    }
        System.out.println("La cantidad de multiplos son: "+y);
}
}
