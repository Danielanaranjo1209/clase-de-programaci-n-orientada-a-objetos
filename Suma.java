/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Unicomfacauca
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Declarar las variables a usar durante el programa
        int a,b,c,e;
        System.out.println("Ingrese los sumandos: ");
        //Leer las variables de ingreso
        Scanner leer=new Scanner(System.in);
        a=leer.nextInt();
        b=leer.nextInt();  
        //Realizamos el cálculo
        c=a+b;
        System.out.println("El resultado de la suma es: "+c);
        
        
        if(c%2==0){
            if (c<0){
                    
                    System.out.println(" El resultado es par y negativo ");
            }       
            else {
            
                    System.out.println(" El resultado es par y negativo ");
            }          
     
        }
        else{
            if (c<0) {
                
            System.out.println(" El resultado es impar y negativo ");
            }
            else {
                System.out.println(" El resultado es impar y positivo ");
            } 
                
        }
        System.out.println("Adiós!");
    }
    
}
