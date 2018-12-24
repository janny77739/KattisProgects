/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autori;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Autori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names=scan.next();
        char [] letterArray=names.toCharArray();
        for(int i=0;i<names.length();i++){
        if(letterArray[i]>= 'A' && letterArray[i]< 'a')
            System.out.print(letterArray[i]);
    }
    }
    
}
