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
public class baiTap10 {
    private Scanner sc = new Scanner(System.in);
    public void nhapmang(int arr[][], int m, int n){        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("a[" +i+ "][" +j+ "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void xuatmang(int arr[][], int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + "\t");                
            }
            System.out.println("\n");
        }
    }
    public void sum_row(int arr[][], int m, int n, int k){
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(i==k){                   
                   arr[k][j] = arr[i][j];                   
                   sum += arr[k][j];
               }                 
            }            
        }
        System.out.println("Tong = " +sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong cua ma tran: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        baiTap10 matrix = new baiTap10();
        System.out.println("Nhap ma tran:");
        matrix.nhapmang(arr, m, n);
        System.out.println("Xuat ma tran:");
        matrix.xuatmang(arr, m, n);
        System.out.print("Nhap vao so hang can tinh tong: ");
        int k = sc.nextInt();
        matrix.sum_row(arr, m, n, k);
    }
}
