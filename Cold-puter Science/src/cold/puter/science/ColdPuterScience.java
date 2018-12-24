/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cold.puter.science;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class ColdPuterScience {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTemp = scan.nextInt();
        int neg=0;
        for(int i=0;i<numTemp;i++){
            int temp = scan.nextInt();
            if(temp<0){
                neg++;
            }
        }
        System.out.print(neg);
    }
    
}
