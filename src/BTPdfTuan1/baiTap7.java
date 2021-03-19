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
public class baiTap7 {    
    public void hoanvi(int arr[], int m, int n){
        int temp = arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        baiTap7 sapxep = new baiTap7();
        int arr[] = new int[10];
        Random rd = new Random();
        for(int i=0;i<10;i++){
            arr[i]=rd.nextInt(50);
        }
        
        for(int i=0;i<10-1;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]>arr[j]){
                    sapxep.hoanvi(arr, i, j);
                }
            }
        }
        
        for(int i=0;i<10;i++){
            System.out.print("  " + arr[i]);
        }
    }
}
