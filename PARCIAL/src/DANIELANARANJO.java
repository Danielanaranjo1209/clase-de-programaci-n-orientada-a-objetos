
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vsp
 */
public class DANIELANARANJO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" por favor ingrese tres numeros ");
        Scanner teclado  = new Scanner(System.in);
        int a =teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        
        if (a>b){
            if (a>c)
                
            System.out.println("el numero "+a+ "es mayor");
            
        }
        
        if (b>a){
            if (b>c)
                System.out.println("el numero "+b+ "es mayor");
            
        }
         if (c>a){
            if (c>b)
                System.out.println("el numero "+c+ "es mayor");
        
        
    }
    
    }
