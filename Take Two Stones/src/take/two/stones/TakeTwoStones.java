/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package take.two.stones;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class TakeTwoStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2==0)
            System.out.print("Bob");
        else
            System.out.print("Alice");
    }
    
}
