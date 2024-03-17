/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto8;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class TallerPto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String a,e,i,o,u;
        System.out.println("Por favor ingrese una letra ");
        Scanner teclado=new Scanner(System.in);
        String letra=teclado.next();
        if (letra == null ? a == null : letra.equals(a)){
            System.out.println("NO es vocal");
        }
        else{
            System.out.println("Es una vocal");
        }
        
    }
}
    
    
}
