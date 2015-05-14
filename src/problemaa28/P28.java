/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa28;

import java.io.*;
import java.math.*;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P28 {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
char op;
	        System.out.println("Desea tirar la moneda (s/n) : ");
	op = (char) System.in.read();
double moneda;	
if (op == 's' || op == 'S'){
moneda = Math.random();		

		if(moneda < 0.5){
			System.out.println("Cara");
		}
		else {
			 System.out.println("Cruz !");
		}
	}
else {
	 System.out.println("La moneda no ha sido lanzada");
        }
	
    }
}
