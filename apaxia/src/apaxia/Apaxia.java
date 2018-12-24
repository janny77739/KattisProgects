/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apaxia;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Apaxia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String word = scan.next();
      char [] letters = word.toCharArray();
      char temp=letters[0];
      System.out.print(letters[0]);
      for(int i=1;i<letters.length;i++){
          if(temp != letters[i])
              System.out.print(letters[i]);
          temp = letters[i];
      }
    }
    
}
