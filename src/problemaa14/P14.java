/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa14;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int x[]={0,0,0,0,0};
        int max=0,min=999999;
        System.out.println("Teclea el primer numero: ");
        x[0]=leer.nextInt();
        
        System.out.println("Teclea el segundo numero: ");
        x[1]=leer.nextInt();
        
        System.out.println("Teclea el tercer numero: ");
        x[2]=leer.nextInt();
        
        System.out.println("Teclea el cuarto numero: ");
        x[3]=leer.nextInt();
        
        System.out.println("Teclea el quinto numero: ");
        x[4]=leer.nextInt();
        
        for (int i = 0; i <= 4; i++) {
            if(x[i]>max){
                max=x[i];
            }
        }
        System.out.println("El numero mayor es: "+max);
        
        for (int i = 0; i <= 4; i++) {
            if(x[i]<min){
                min=x[i];
            }
        }
        System.out.println("El numero menor es: "+min);
            
    }
}
