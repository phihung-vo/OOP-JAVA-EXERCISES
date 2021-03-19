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
public class BaiTap5 {
    public static void main(String[] args) {
        int m,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m = ");
        m = sc.nextInt();
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        
        if(m>n){
            for(i=m;i>=1;i--){
                if(m%i==0 && n%i==0){
                    System.out.println("UCLN cua " +m+ " va " +n+ " la: " + i);
                    break;
                }
            }
        }
        else{
            for(i=n;i>=1;i--){
                if(m%i==0 && n%i==0){
                    System.out.println("UCLN cua " +m+ " va " +n+ " la: " + i);
                    break;                    
                }
            }
        }        
    }
}
