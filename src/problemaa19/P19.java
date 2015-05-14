/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa19;

import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P19 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        int hora=00;
        int min=00;
        System.out.println("Teclee la hora: ");
        hora=leer.nextInt();
        System.out.println("Teclee los minutos: ");
        min=leer.nextInt();
        System.out.println("Son: "+hora+":"+min);
        
        
        
        for (int i = 0; (hora<24); i++) 
        {
             
            if((hora<=24))
            {
               
            //hora=hora+1;
                if(min<59)
                {
                    min=min+1;
                    System.out.println("Son: "+hora+":"+min);  
                    
                }
                else
                {
                    if((min==59)&&(hora<24))
                    {
                        hora=hora+1;
                        min=-1;
                    }
                }
            }
            
        }
            
            
    }
}
