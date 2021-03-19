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
public class BaiTap1 {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        long sum=0;
        for(i=1;i<=n;i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("KET QUA = " + sum);
    }
}