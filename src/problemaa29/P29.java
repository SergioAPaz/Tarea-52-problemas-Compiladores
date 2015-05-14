/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa29;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P29 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x=0,cont=0;
        //int y = (int) Math.floor(Math.random()*6+1);
        for (int i = 0; i <= 99; i++) {
            System.out.println("-----Serie "+i);
            int d1 = (int) Math.floor(Math.random()*6+1);
            System.out.println("Dado 1: "+ d1);
            int d2 = (int) Math.floor(Math.random()*6+1);
             System.out.println("Dado 2: "+d2);
            if(d1+d2==10)
                cont++;
            
        }
        System.out.println("Las veces que entre los dos suman 10 son: "+cont);
             
      
       
     }
    
     
    }

