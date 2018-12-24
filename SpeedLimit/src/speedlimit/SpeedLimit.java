/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedlimit;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class SpeedLimit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trip = scan.nextInt();
        while(trip != -1){
          int prevSpeed=0;
          int prevTime =0;
          int dist=0;
          for(int i =0; i<trip;i++){
              int speed=scan.nextInt();
              int time=scan.nextInt();
              dist =dist +((time-prevTime)*speed);
              prevSpeed=speed;
              prevTime=time;
          }
          trip = scan.nextInt();
          System.out.println(dist + " miles");
        }
    }
    
}
