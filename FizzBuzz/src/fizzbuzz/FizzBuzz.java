/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fizz = scan.nextInt();
        int buzz = scan.nextInt();
        int num = scan.nextInt();
        for(int i=1;i<=num;i++){
            if(i%fizz==0){
                if(i%buzz==0)
                    System.out.println("FizzBuzz");
                else
                    System.out.println("Fizz");
            }
            else if(i%buzz==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
                
        }
    }
    
}
