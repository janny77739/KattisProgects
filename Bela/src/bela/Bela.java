/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bela;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Bela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int numHands =scan.nextInt();
       int score =0;
        String trump = scan.next();
        char t = trump.charAt(0);
        for(int i=0;i<4*numHands;i++){
            String Current = scan.next();
            char [] cards = Current.toCharArray();
            if(cards[1]==t)
                score = score + domScore(cards);
            else
                score= score + nonDom(cards);
        }
        System.out.print(score);
    }

    private static int domScore(char[] cards) {
        if(cards[0]=='A')
            return 11;
        else if(cards[0]=='K')
            return 4;
        else if(cards[0]=='Q')
            return 3;
        else if(cards[0]=='J')
            return 20;
        else if(cards[0]=='T')
                return 10;
        else if(cards[0]=='9')
            return 14;
        else
            return 0;
                    
    }

    private static int nonDom(char[] cards) {
        if(cards[0]=='A')
            return 11;
        else if(cards[0]=='K')
            return 4;
        else if(cards[0]=='Q')
            return 3;
        else if(cards[0]=='J')
            return 2;
        else if(cards[0]=='T')
                return 10;
        else
            return 0;    
    }
    
}
