/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktor;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Faktor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int articles = scan.nextInt();
        int publish =scan.nextInt();
        int total = ((publish-1)*articles)+1;
        System.out.print(total);
    }
    
}
