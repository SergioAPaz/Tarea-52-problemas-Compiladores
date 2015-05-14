/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa15;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */


//void impresion();
public class P15 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Scanner leer2=new Scanner(System.in);
        int x=10,y=0;
        System.out.println("Ingresa el primer numero: ");
        x=leer.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        y=leer2.nextInt();
        impresion(x,y);
        
    }

    public static void impresion(int x, int y){
        int menor=0,mayor=0;
        if(x<y){
            menor=x;
            mayor=y;
        }
        else
        {
            mayor=x;
            menor=y;
        }
        int i,cont=0,pares=0,impar=0;
        System.out.println("Los numeros ordenados de menor a mayor son: ");
         for ( i = 0; i <=mayor ; i++) {
             if(menor<=mayor){
             System.out.println(menor);
             menor++;
             cont++;
             if(menor%2==0){
                 pares++;
             }
             else{
                 if((menor%2==1)){
                 impar=menor+impar;
             }
             }
                     }   
         }
        System.out.println("La cantidad de numeros que hay entre ellos son: "+cont);
        System.out.println("El numero de pares que hay es: "+pares);
        System.out.println("La suma de los impares es: "+impar);
        
         
         
         
    }
}


