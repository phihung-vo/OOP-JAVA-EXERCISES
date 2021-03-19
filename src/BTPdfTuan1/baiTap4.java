/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class baiTap4 {
    private Scanner sc = new Scanner(System.in);
    private Random rd = new Random();
    
//    public void nhapmang(int arr[][], int m, int n){
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
////                System.out.print("arr[" +i+ "][" +j+ "] = ");
//                arr[i][j] = rd.nextInt(50);
//            }
//        }
//    }
    public void xuatmang(int arr[][], int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = rd.nextInt(50);
                System.out.println("  arr[" +i+ "][" +j+ "] = " + arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        baiTap4 array = new baiTap4();
        int m,n;
        System.out.print("Nhap so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        n = sc.nextInt();
        int arr[][] = new int[m][n];
//        System.out.println("Nhap ma tran:");
//        array.nhapmang(arr, m, n);
        System.out.println("Xuat ma tran:");
        array.xuatmang(arr, m, n);
    }
}
