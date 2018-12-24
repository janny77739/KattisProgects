/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bijele;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Bijele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int [] list = new int[6];
      int [] needed= {1,1,2,2,2,8};
      for(int i=0;i<6;i++){
         list[i]=scan.nextInt();
      System.out.print(needed[i]-list[i] + " ");
      }
    }
    
}
