/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa20;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P20 {
    public static void main(String[] args) {
         int var1;
        P20 prob = new P20();
        Scanner esc = new Scanner(System.in);
        System.out.println("Teclee un numero");
        var1= esc.nextInt();
        System.out.println("Factorial: "+prob.factorial(var1));
    }
    
    private double factorial(int a){
        double var1=a;
        for (int i = a; i > 2; i--) {
            var1 = var1*(i-1);
        }
        return var1;
    }
    }

