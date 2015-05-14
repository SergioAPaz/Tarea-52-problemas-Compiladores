/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaa23;

/**
 *
 * @author Sergio Alejandro Paz Holguin 264951
 * @version 1.0
 * @since 13/05/2015
 */
public class P23 {
    public static void main(String[] args) {
        int x=0,x2=1,x3=2;
        for (int i = 0; i < 34; i++) {
            System.out.println(x+"\t"+x2+"\t"+x3);
            x=x3+1;
            x2=x+1;
            if(x2!=100)
            x3=x2+1;
            else
                x3=0;
        }
    }
}
