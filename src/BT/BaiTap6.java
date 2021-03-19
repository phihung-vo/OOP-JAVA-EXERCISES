/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class BaiTap6 {
    public static void main(String[] args) {
        int choice,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lua chon: 1.For / 2.While");
        choice = sc.nextInt();
        
        if(choice==1){
            for(i=2;i<=10;i++){
                if(i%2!=0)
                    continue;                                    
                else
                    System.out.print(i + " ");
            }
        }
        else{
            i=2;
            while(i<=10){
                if(i%2==0)
                    System.out.print(i + " ");
                    i++;
            }
        }
    }
}
