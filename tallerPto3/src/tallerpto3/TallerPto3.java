/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto3;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class TallerPto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a;
       Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor ingrese un numero entre 0 y 9.999 ");
        a = teclado.nextInt();
        if (a <10 ){
            System.out.println(" el numero: "+a+"tiene una cifra ");
        }
        if (a>=10 & a<100){
            System.out.println(" el numero: "+a+ " tiene dos cifras ");
        }
        if (a>=100 & a<1000){
            System.out.println(" el numero: "+a+" tiene tres cifas ");
        }
        if ( a>=1000 & a<10000){
            System.out.println(" el numero: "+a+ " tiene cuatro cifras ");
        }
       
    }
    
}
