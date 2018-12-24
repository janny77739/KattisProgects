/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spavanac;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Spavanac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int mins = scan.nextInt();
        if(mins<45){
            mins=mins+15;
            if(hours == 0)
                hours=23;
            else
                hours--;
        }
        else
            mins=mins-45;
        System.out.print(hours+" "+mins);
    }
    
}
