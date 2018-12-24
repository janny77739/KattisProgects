/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package judgingmosse;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class JudgingMosse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int left = scan.nextInt();
        int right = scan.nextInt();
        if(left==0&&right==0)
            System.out.print("Not a moose");
        else if( left == right)
            System.out.print("Even "+ 2*right);
        else if(left>right)
            System.out.print("Odd "+2*left);
        else
            System.out.print("Odd "+2*right);
    }
    
}
