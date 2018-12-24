/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarifa;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Tarifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int rollOver = 0;
       int bytesAllow= scan.nextInt();
       int numMonths = scan.nextInt();
       for(int i =0;i<numMonths;i++){
           int bytesUsed= scan.nextInt();
              rollOver=rollOver+(bytesAllow-bytesUsed);     
       }
       System.out.println(rollOver+bytesAllow);
    }
    
}
