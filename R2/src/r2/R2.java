/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r2;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class R2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int firstR = scan.nextInt();
        int Mean = scan.nextInt();
        int secondR = (Mean*2)-firstR;
        System.out.println(secondR);
    }
    
}
