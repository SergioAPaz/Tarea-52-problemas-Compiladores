/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa27;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P27 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x;
        System.out.println("Teclea un numero");
        x=leer.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(x+"x"+i+"="+(x*i));
        }
              
    }
}
