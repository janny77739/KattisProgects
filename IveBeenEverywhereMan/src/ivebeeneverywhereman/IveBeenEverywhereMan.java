/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivebeeneverywhereman;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class IveBeenEverywhereMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for(int i =0;i<testCase;i++){
            int numCity=scan.nextInt();
            int count=0;
            int flag=0;
            String [] Cities = new String[numCity];
            for(int j=0;j<numCity;j++){
                Cities[j]=scan.next();
                for(int z=0;z<j;z++){
                   if(Cities[j].equals(Cities[z])){
                       flag=1;
                   }
                }
                if(flag==0)
                    count++;
                else
                    flag=0;
            }
            System.out.println(count);
        }
    }
    
}
