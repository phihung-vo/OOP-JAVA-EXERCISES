/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan1;

import java.util.Scanner;
//import java.util.Date;

/**
 *
 * @author PHI HUNG
 */
public class baiTap3{
    private Scanner sc = new Scanner(System.in);
    public void nhapmang(int arr[], int n){
       for(int i=0;i<n;i++){
           System.out.print("a[" +i+ "] = ");
           arr[i] = sc.nextInt();
       }
    }
    public void timPtMax(int arr[], int n){
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Gia tri lon nhat trong mang la: " + max);
       }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        baiTap3 phantumax = new baiTap3();
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        phantumax.nhapmang(arr, n);
        phantumax.timPtMax(arr, n);
    }
}