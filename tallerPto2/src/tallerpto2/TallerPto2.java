/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto2;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class TallerPto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String contraseña,clave;
        Scanner teclado = new Scanner (System.in);
        String pin=contraseña;
       
        do{
            System.out.println(" Porfavor ingrese su contraseña ");  
            clave= teclado.next();
            if( clave == pin ){
                System.out.println(" La contraseña ingresada es correcta "+ pin);
                
            }
        }while(clave == pin);
        
    }
        
}        