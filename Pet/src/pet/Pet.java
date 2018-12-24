/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Pet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max=0;
        int line=0;
        int sum=0;
        int num;
        for(int i=1;i<=5;i++){
            for(int j=0;j<4;j++){
                num=scan.nextInt();
                sum=sum+num;
            }
            if(sum>max){
                max=sum;
                line=i;
            }
            sum=0;
        }
        System.out.print(line+" "+max);
    }
    
}
