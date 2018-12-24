/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zamka;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class Zamka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int D = scan.nextInt();
        int X = scan.nextInt();
        int digitPlaces = 1;
        int spot =1;
        int Low=L;
        int High = D;
        while(D/digitPlaces>0){
            digitPlaces= digitPlaces *10;
            spot++;
        }
        int min = findMin(digitPlaces,spot,X, Low);
        int max = findMax(X,digitPlaces,spot,High);
        System.out.println(min);
        System.out.println(max);
    }

    private static int findMin(int digitPlaces, int spot, int X, int Low) {
        int flag =0;
        while(flag==0){
           flag = check(X,Low,digitPlaces,spot);
          if(flag==0)
              Low++;
        }        
        return Low;

    }

    private static int check(int X, int Low) {
    int places=1;
    int num=1;
    int sum =0;
    int temp;
    while(Low/places>0){
        temp=Low/num;
        sum=sum+ (temp%places);
        num=num*10;
        places=places*10;
    }
    sum=sum+(Low%10);
    if(sum==X){
        return 1;
    }
    else 
        return 0;
    }

    private static int findMax(int X, int Place, int spot, int High) {
    int flag =0;
        while(flag==0){
           flag = check(X,High, Place,spot);
          if(flag==0)
             High--;
        }        
        return High;
  
    }

    private static int check(int X, int High, int Place, int spot) {
     int sum=0;
     int places=Place;
     int num=spot;
     int digit=1;
     int temp = High;
     while(num>0){
         sum=sum+(temp/places);
         temp=temp%places;
         places=places/10;
         num--;
     }
     //sum=sum+(High%10);
        if(sum==X)
        return 1;
        else
            return 0;
    }
    
}
