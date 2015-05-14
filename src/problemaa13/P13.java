/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa13;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P13 {
    public static void main(String[] args) {
          int cont = 0, cont2=0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Multiplo de 2: "+i);
                cont++;
            }else if(i % 3 == 0)
            {
                System.out.println("Multiplo de 3: "+i);
                cont2++;
            }
        }
        
        System.out.println("La cantidad de numeros multiplos de 2 es: "+ cont);
        System.out.println("La cantidad de numeros multiplos de 3 es: "+ cont2);
    }
}
