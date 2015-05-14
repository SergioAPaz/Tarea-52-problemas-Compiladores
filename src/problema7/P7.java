/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P7 {
     public static void main(String[] args) {
         int y=0;
         char x='s';
         String urge2="hd";
         Scanner leer=new Scanner(System.in); 
         Scanner urge=new Scanner(System.in); 
         while((x=='s')||(x=='S')){
             System.out.println("Ingrese cualquier palabra: ");
             urge2=urge.next();
             y++;
             
             System.out.println("Desea seguir ingresando palabras? s/n: ");
              //x=leer.next(); 
              x=leer.next().charAt(0);
             
         }
         System.out.println("El numero de palabras ingresadas es: "+y);
     }
}
