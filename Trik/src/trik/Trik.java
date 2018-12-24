/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trik;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Trik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        char [] commands = string.toCharArray();
        int ball =1;
        for(int i=0;i<commands.length;i++){
            if(commands[i]=='A'){
                if(ball==1)
                    ball=2;
                else if(ball==2)
                    ball=1;
            }
            if(commands[i]=='B'){
                if(ball==2)
                    ball=3;
                else if(ball==3)
                    ball=2;
            }
            if(commands[i]=='C'){
                if(ball==1)
                    ball=3;
                else if(ball==3)
                    ball=1;
            }
        }
        System.out.print(ball);
    }
    
}
