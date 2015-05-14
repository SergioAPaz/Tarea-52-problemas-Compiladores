/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P43 {
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        
         String DNI;
        String NOMBRE;
        String APELLIDOS;
        String DIRECCION;
        String PROVINCIA;
       
        File file = new File("Datos.dat");
        if(!file.exists()){
            try{
            file.createNewFile();
                System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){ex.printStackTrace();}
            
            try{
            FileWriter fw= new FileWriter(file,true);
             System.out.println("Ingrese su dni");
             DNI = entrada.nextLine();
        
             System.out.println("Teclea el nombre");
             NOMBRE=entrada.nextLine();
        
             System.out.println("Teclea los apellidos");
             APELLIDOS=entrada.nextLine();
        
             System.out.println("Teclea la direccion");
             DIRECCION=entrada.nextLine();
        
             System.out.println("Teclea la provincia");
             
              PROVINCIA=entrada.nextLine();
            fw.append("DNI: "+DNI);
            fw.append("Nombre: "+NOMBRE);
            fw.append("Apellidos: "+APELLIDOS);
            fw.append("Direccion: "+DIRECCION);
            fw.append("Provincia: "+PROVINCIA);
            fw.close();
            }catch(IOException ex){ex.printStackTrace(); }
            
        } else{
            try{
            FileWriter fw= new FileWriter(file,true);
             System.out.println("Ingrese su dni");
             DNI = entrada.nextLine();
        
             System.out.println("Teclea el nombre");
             NOMBRE=entrada.nextLine();
        
             System.out.println("Teclea los apellidos");
             APELLIDOS=entrada.nextLine();
        
             System.out.println("Teclea la direccion");
             DIRECCION=entrada.nextLine();
        
             System.out.println("Teclea la provincia");
             
              PROVINCIA=entrada.nextLine();
            fw.append("DNI: "+DNI);
            fw.append("Nombre: "+NOMBRE);
            fw.append("Apellidos: "+APELLIDOS);
            fw.append("Direccion: "+DIRECCION);
            fw.append("Provincia: "+PROVINCIA);
            fw.close();
            }catch(IOException ex){ex.printStackTrace(); }
     
            
            
}
    }
}
