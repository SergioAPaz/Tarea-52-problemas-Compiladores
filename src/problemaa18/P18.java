/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa18;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P18 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String x;
        int veces=0;
                char letra;
        System.out.println("Teclee una palabra: ");
        x=leer.next();
        System.out.println("Teclee la letra que desea buscar dentro de la palabra: ");
        letra=leer.next().charAt(0);
        
        char []caracteres=x.toCharArray();
			for(int i=0;i<=caracteres.length-1;i++){
				if(letra==caracteres[i]){
					veces++;
				}
				
			}
			System.out.println("Se encontro: "+veces+" veces");
		
    }
}
