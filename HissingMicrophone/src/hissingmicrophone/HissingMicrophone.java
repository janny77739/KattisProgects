/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hissingmicrophone;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class HissingMicrophone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char [] letters = word.toCharArray();
        int count=0;
        int flag =0;
        for(int i=0;i<letters.length;i++){
            if(letters[i]=='s'){
                count++;
            if(count>=2){
               flag=1;
            }
            }
            else
                count=0;
        }
            if(flag==1)
                System.out.print("hiss");
            else
                System.out.print("no hiss");
    }
    
}
