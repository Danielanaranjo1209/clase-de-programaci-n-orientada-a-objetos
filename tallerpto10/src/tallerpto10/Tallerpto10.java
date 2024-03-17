/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto10;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class Tallerpto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n,m=0;
        System.out.println(" se van a ingresar 15 numeros para calcular la suma entre ellos ");
        Scanner teclado = new Scanner (System.in);
        for (int i = 0; i <=15; i++) {
            System.out.println(" por favor ingrese un numero");
            n=teclado.nextInt();
            m=n+m;
            
            
        }
        System.out.println(" La suma de los 15 numeros ingresados es:"+m);
    }
    
}
