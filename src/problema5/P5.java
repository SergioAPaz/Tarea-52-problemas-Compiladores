/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P5 {
    public static void main(String[] args) {
         int x=1, cont=0;
        for (int i = 0; i<=49; i++) {
             System.out.println(x);
             x=x+2;
           cont=cont+1;
           
        }
         System.out.println("El numero de impares son: "+cont);
}
}
