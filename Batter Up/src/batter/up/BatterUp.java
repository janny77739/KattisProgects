/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batter.up;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class BatterUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count =num;
        double total=0;
        for(int i=0;i<num;i++){
        int score =scan.nextInt();
        if(score>=0)
            total = total+score;
        else
            count--;
    }
        total=total/count;
        System.out.print(total);
    }
    
}
