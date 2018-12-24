/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nastyhacks;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class NastyHacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int numCase=scan.nextInt();
       for(int i=0;i<numCase;i++){
       int noAd =scan.nextInt();
       int ad= scan.nextInt();
       int costAd=scan.nextInt();
       int addGain = ad-costAd;
       if(addGain>noAd)
           System.out.println("advertise");
       else if(addGain==noAd)
           System.out.println("does not matter");
       else
           System.out.println("do not advertise");
       }
    }
    
}
