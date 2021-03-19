/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan1;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class baiTap9 {        
    public static int fibo(int n){
        do{
            if(n==1||n==2){
                return 1;
            }
            else{
                return fibo(n-1) + fibo(n-2);
            }
        }while(n<1);
    }
    public void daySoFibo(int m){
        for(int i=1;i<=m;i++){
            System.out.println(i+ ": " +fibo(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        baiTap9 fib=new baiTap9();
        int n;
        do{
            System.out.print("Nhap n = ");
            n = sc.nextInt();
        }while(n<0);
        fib.daySoFibo(n);
    }
}
