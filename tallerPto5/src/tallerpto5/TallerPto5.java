/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto5;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class TallerPto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int edad,ingresos;
      Scanner teclado = new Scanner (System.in);
        System.out.println(" Por favor digite su edad ");
        edad = teclado.nextInt();
        System.out.println(" Por favor digite sus ingresos mensuales : €");
        ingresos = teclado.nextInt();
        
        if (edad >=16 && ingresos >= 1000){
            System.out.println(" Señor usuario tiene que tributar ");
        }else{
            System.out.println(" Señor usuario no tiene que tributar ");
        }
      
    }
    
}
