/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa12;



/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P12 {
    public static void main(String[] args) {
        int x=0,Par=0, Imp=0;
        
        for (int i = 0; i <= 100; i++) {
            if(i % 2==0)
            {
                Par= Par + i;
            }
            else
            {
                Imp= Imp + i;
            }
        }
        System.out.println("La suma de los pares es: "+Par);
        System.out.println("La suma de los impares es: "+Imp);
    }
}
