/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P6 {
     public static void main(String[] args) {
    Scanner leer=new Scanner(System.in); 
    int num; 
    System.out.println("Teclee un numero: "); 
    num = leer.nextInt(); 
    

          int x=1;
        for (int i = 0; i<num; i++) {
             System.out.println(x);
             x++;
            
        }
       
     }
}
