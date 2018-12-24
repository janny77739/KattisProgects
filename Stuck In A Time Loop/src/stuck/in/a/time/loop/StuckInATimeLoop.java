/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuck.in.a.time.loop;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class StuckInATimeLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+ " Abracadabra");
        }
    }
    
}
