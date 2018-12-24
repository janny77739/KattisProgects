/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvingforcarrots;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class SolvingForCarrots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numPeople = scan.nextInt();
        int numCarrots =scan.nextInt();
        String names;
        for(int i=0;i<numPeople;i++)
            names=scan.nextLine();
        System.out.print(numCarrots);
    }
    
}
