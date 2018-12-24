/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pot;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Pot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numint = scan.nextInt();
        int total =0;
        for(int i=0;i<numint;i++){
            int num=scan.nextInt();
            int power = num%10;
            num = num/10;
            total=(int) (total + Math.pow(num, power));
        }
        System.out.println(total);
    }
    
}
