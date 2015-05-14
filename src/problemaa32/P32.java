/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa32;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P32 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x;
        System.out.println("Ingresa un numero");
        x=leer.nextInt();
        primos(x);
        factorial(x);
        tabla(x);
    }

public static void primos(int x){
    int y=0;
     if (x >= 1) {
            for (int i = 1; i < (x + 1); i++) {
                if (x % i == 0) {
                    y++;
                }
            }

            if (y != 2) {
                System.out.println("\nEl numero no es primo");
            } else {
                System.out.println("\nEl numero si es primo");
            }
        
        
    }
    
    

}

public static void factorial(int x){
    int suma=1;
 for(int i=x;i>1;i--){ 
suma=suma*i; 
} 
System.out.println("\nEl factorial de "+x+" es "+suma); 
} 


public static void tabla(int x){
    System.out.println("\nLa tabla es: ");
    for (int i = 0; i <= 10; i++) {
        
        System.out.println(i+"x"+x+": "+(x*i));
    }
}
}