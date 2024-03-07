/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class CARGO {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a,c;//texto
         
        int d,b,w,x,y,z,v,r = 0,e,f,g,h;//numeros
        
        int productos;
        
      
        
        
        System.out.println("                        BIENVENIDO A CARGO                      ");
        System.out.println("________________________________________________________________");
        System.out.println(" INGRESE SU NOMBRE Y APELLIDO ");
        Scanner leer=new Scanner (System.in); 
        
        a = leer.next();

        System.out.println(" INGRESE SU NÚMERO DE CEDULA ");
        
        b = leer.nextInt();

        System.out.println(" INGRESE SU DIRECCIÓN ");
        
        c = leer.next();

        System.out.println ("ESCOJA DE LA LISTA LOS ITEMS QUE DESEA COMPRAR Y FINALICE SELECCIONANDO OK ");

        while (5!=r) {
                
            System.out.println(" LISTA DE PRODUCTOS ");
            System.out.println("   1. PERLIN CAL 14 PRECIO: $190.000 ");
            System.out.println("   2. CEMENTO ARGOS BULTO 50 KG PRECIO: $31.500 ");
            System.out.println("   3. ESTUCO BULTO 50 KG SIKA $54.000 ");
            System.out.println("   4. PINTURA VINILTEX GALON $98.000 ");
            System.out.println("   5. OK");
                x=190000;// PERLIN X
                z=31500;//CEMENTO Z
                w=54000;//ESTUCO
                v=98000;//PINTURA V
            System.out.println(" ELIJA UNA OPCIÓN ");
            
             r = leer.nextInt();
             
                        
            System.out.println(" INGRESE LA CANTIDAD ");
            
            d= leer.nextInt();        
            
            switch (r) {
                    case 1:               
			e=x*d;
			System.out.println (+e);
                        break;        
                    case 2:
                            f=z*d;
                            System.out.println (+f);
                            break;        
                    case 3:
                            g=w*d;
                            System.out.println (+g);
                            break;        
                    case 4:
                            h=v*d;
                            System.out.println (+h);
                            break;
                        }
 
       
                         
          

           
        }

    }
    
}
  


	 
	
	