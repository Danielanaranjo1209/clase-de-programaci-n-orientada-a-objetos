/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author vsp
 */
public class TALLER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float peso, estatura;
        System.out.println(" Por favor ingrese su peso ");
        Scanner teclado = new Scanner (System.in);
        peso = teclado.nextFloat();
        System.out.println(" Por favor ingrese su estatura ");
        estatura = teclado.nextFloat();
        double idmc = peso/Math.pow(estatura, estatura);
        if (idmc< 16){
            System.out.println("Su indice de masa corporal es:"+idmc+ "Delgadez severa ");
        }
        if (idmc>=16 & idmc<17){
            System.out.println("Su indice de masa corporal es:"+idmc+" Delgadez moderada ");
        }   
        if ( idmc>=17 & idmc<18.5){
            System.out.println("Su indice de masa corporal es:"+idmc+" Delgadez leve ");
        }    
        if ( idmc>= 18.5 & idmc<25){
            System.out.println("Su indice de masa corporal es:"+idmc+"Peso normal");
        }
        if ( idmc>= 25 & idmc<30){
            System.out.println("Su indice de masa corporal es:"+idmc+" Sobre peso ");
            
        }
        if (idmc >=30 & idmc< 35){
            System.out.println("Su indice de masa corporal es:"+idmc+" Obesidad leve ");
        }
        if (idmc >=35 & idmc<40){
            System.out.println("Su indice de masa corporal es:"+idmc+" Obesidad moderada");
            
        }
        if (idmc>=40){
            System.out.println("Su indice de masa corporal es:"+idmc+"Obesidad morbida ");
        }
    }
    
}
