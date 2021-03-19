/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



/**
 *
 * @author PHI HUNG
 */
public class baiTap8 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            do{
               System.out.print("a[" +(i+1)+ "] (32<=a[" +(i+1)+ ">=126 :");
               a[i] = sc.nextInt();
               if(a[i]<32||a[i]>126){
                   System.out.println("Nhap lai!");
               }
            }while(a[i]<32||a[i]>126);
        }
        System.out.println("STT" + "\tKy tu" + "\tMa ASCII");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+ "\t" +(char)a[i]+ "\t" +a[i]);
        }
    }
}
