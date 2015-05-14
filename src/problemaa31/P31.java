/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa31;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P31 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x=0,y=0;
        int op;
        System.out.println("Introduzca un numero");
        x=leer.nextInt();
        System.out.println("Introduzca otro numero");
        y=leer.nextInt();
        
        System.out.println("-----Menu-----");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("Teclea la opcion a elegir: ");
        op=leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("La suma es: "+(x+y));    
            break;
            case 2:
                System.out.println("La resta es: "+(x-y));
                break;
            case 3:
                
                System.out.println("La multiplacion es: "+(x*y));
                
                break;
            case 4:
                float r;
                r=x/y;
                
                 System.out.println("La division es: "+(r));
               
                        break;
                
        }
    }
}
