/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa17;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P17 {
    public static void main(String[] args) {
         int var1 = 0, var2 = 0, temp, cont1 = 0, sumar = 0;
        Scanner esc = new Scanner(System.in);
        System.out.println("Primer valor");
        var1 = esc.nextInt();
        System.out.println("Segundo valor");
        var2 = esc.nextInt();
        if (var2 < var1) {
            temp = var2;
            var2 = var1;
            var1 = temp;
        }
        for (int i = var2; i >= var1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
                cont1++;
                sumar = sumar + i;
            }
        }
        System.out.println("Cantidad de numeros pares " + cont1);
        System.out.println("Suma de numeros pares " + sumar);
    }
}
