/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio.numeros.naturales;

import java.util.Scanner;

/**
 *
 * @author Unicomfacauca
 */
public class PROMEDIONUMEROSNATURALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n,suma=0;
        float promedio;
        
        System.out.println("INGRESE LA CANTIDAD DE NUMEROS NATURALES A PROMEDIAR");
        
        Scanner entrada=new Scanner(System.in);
        
        n = entrada.nextInt();
        
        for (int i=1; i<=n; i++){
        
            suma=suma+i;        
  
            
        }
        promedio=suma/n;
                
                System.out.println("El promedio de los primeros "+n+" numeros naturales es: "+promedio);
        
        
        
        
        
    }
    
}
