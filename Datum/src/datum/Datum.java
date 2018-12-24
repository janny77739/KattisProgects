/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datum;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Datum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int day = scan.nextInt();
       int month = scan.nextInt();
       if(month>=2)
           day=day + 31;
       if(month>=3)
           day = day +28;
       if(month >=4)
           day =day+31;
       if(month>=5)
           day = day +30;
       if(month>=6)
           day = day+31;
       if(month >=7)
           day =day+30;
       if(month >=8)
           day = day +31;
       if(month >=9)
           day = day+31;
       if(month >=10)
           day=day+30;
       if(month>=11)
           day = day+31;
       if(month ==12)
           day=day+30;
       day=day%7;
       if(day==1)
           System.out.print("Thursday");
       if(day == 2)
           System.out.print("Firday");
       if(day==3)
           System.out.print("Saturday");
       if(day==4)
           System.out.print("Sunday");
       if(day ==5)
           System.out.print("Monday");
       if(day==6)
           System.out.print("Tuesday");
       if(day==0)
           System.out.print("Wednesday");
    }
    
}
