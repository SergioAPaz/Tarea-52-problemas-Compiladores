/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa21;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P21 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int r;
        System.out.println("Teclea el numero de la opcion que deseas elegir: ");
        System.out.println("1) Suma de pares entre el 1 y 1000");
        System.out.println("2) Suma de impares entre el 1 y 1000");
        r=leer.nextInt();
        
        switch(r)
        {
            case 1:
                int Par=0;
                for (int i = 0; i <= 1000; i++) 
                {
                    if(i % 2==0)
                    {
                        Par= Par + i;
                    }      
                }
                
            System.out.println("La suma de los pares es: "+Par);
            break;
            case 2:
                int Imp=0;
                for (int i = 0; i <= 1000; i++) 
                {
            if(i % 1==0)
            {
                 Imp= Imp + i;
            }
            
        }
               System.out.println("La suma de los impares es: "+Imp);
                break;
        }
        
}
}