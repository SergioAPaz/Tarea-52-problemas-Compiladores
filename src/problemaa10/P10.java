/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa10;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x=0;
        System.out.println("Ingresa un numero: ");
        x=leer.nextInt();
        if(x%2==0){  
             System.out.println(x+" es par");  
        }else{  
            System.out.println(x+" es impar");  
        }     
    }
}
