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
public class BaiTap3 {
    public static void main(String[] args) {
        int n,i,gt=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        n = sc.nextInt();
        for(i=1;i<n;i++){
            gt += gt*i;
        }
        System.out.println("Giai thua: " + gt);
    }
}
