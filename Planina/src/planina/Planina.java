/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planina;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Planina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();
        //int points = iterations*2+1;
        int sides= 2;
        for(int i=0; i<iterations;i++){
            sides=((sides-1)*2)+1;
        }
          System.out.println(sides*sides);
    }
    
}
