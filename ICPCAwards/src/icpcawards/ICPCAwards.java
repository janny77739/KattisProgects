/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpcawards;

import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class ICPCAwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flag =0;
        int count =0;
        int numTeams=scan.nextInt();
        String[] schoolList= new String[numTeams];
        String [] teamList= new String[numTeams];
        for(int i=0;i<numTeams;i++){
            schoolList[i]=scan.next();
            teamList[i]=scan.next();
                for(int j=0;j<i;j++){
                    if(schoolList[j].equals(schoolList[i]))
                        flag=1;
                }
                if(flag==0 ){
                if(count<12)
                    System.out.println(schoolList[i]+ " "+ teamList[i]);
               count++;
                }
                else
                    flag=0;
        }
         }
    
}
