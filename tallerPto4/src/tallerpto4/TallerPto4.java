/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto4;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class TallerPto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,año;
        Scanner teclado= new Scanner (System.in);
        System.out.println(" Porfavor digite el día ");
        dia= teclado.nextInt();
        System.out.println(" Por favor digite el mes ");
        mes = teclado.nextInt();
        System.out.println(" Por favor digite el año ");
        año= teclado.nextInt();
        if ( dia>1 & dia<31 && mes>1 & mes<=12 && año>1 & año<=2024){
                
            System.out.println("La fecha ingresada : " +dia+"/"+mes+"/"+año+ " es correcta ");
        }else{
            System.out.println(" Por favor ingrese una fecha valida ");
        }
        
       
        
        
        
   
    }
    
}
