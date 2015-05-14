/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa35;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P35 {
    public static void main(String[] args) {
        
         float[] vec = new float[10];
         Scanner leer=new Scanner(System.in);
         float sum=0,media;
         for (int i = 0; i <10; i++) {
             System.out.println("Ingresa la calificacion "+i+": ");
          vec[i]=leer.nextFloat();
       
          
        }
        
        for (int i = 0; i <10; i++) {
        sum=(vec[i]+sum);    
        }
        media=sum/10;
        System.out.println("La media es: "+(media));
     buscar(vec);   
    }
    

public static void buscar(float[] vec){
    Scanner leer2=new Scanner(System.in);
    float y=0;
    int listo=0;
    System.out.println("Ingrese la calificacion a buscar: ");
    y=leer2.nextFloat();
    
    for (int i = 0; i < 10; i++) {
        if((y==vec[i])&&(listo==0)){
            System.out.println("La nota si existe.");
        listo=1;
        }
       
    }
}
}