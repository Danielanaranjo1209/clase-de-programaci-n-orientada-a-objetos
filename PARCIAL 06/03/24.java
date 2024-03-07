/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author vsp
 */
public class PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d=4;
        for (int i = 1; i <=d; i++) {
            for (int j = 1; j <=d-i; j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <=2*i-1; k++) {
                    System.out.print("*");
                }
            System.out.println(" ");
            
        }
    }
}
  