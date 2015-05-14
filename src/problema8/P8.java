/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P8 {
    public static void main(String[] args) {
        char x='S';
        Scanner test=new Scanner(System.in);
        while((x=='S')||(x=='N')){
            System.out.println("Sigue ingresando la letra: ");
            x=test.next().charAt(0);
        }
        System.out.println("No ingresaste la letra S o N.");
    }
}
