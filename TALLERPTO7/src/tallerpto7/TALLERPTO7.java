/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpto7;

import java.util.Scanner;



/**
 *
 * @author vsp
 */
public class TALLERPTO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,numero,a=0,b=0,c=0;
        System.out.println(" Porfavor ingrese la cantidad de numeros que va a consultar ");
        Scanner teclado = new Scanner (System.in);
        n=teclado.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(" Porfavor ingresa los numeros");
            numero=teclado.nextInt();
            if (numero>0){
                a=a+1;
            }
            else if(numero<0){
                b=b+1;
                
            }else{
                c=c+1;
            }
        }
        System.out.println(" la cantidad de numeros ingresados mayores a cero es:"+a);
        System.out.println(" la cantidad de numeros ingresados menores a cero es:"+b);
        System.out.println(" la cantidad de numeros ingresados iguales  a cero es:"+c);
    }
    
}
