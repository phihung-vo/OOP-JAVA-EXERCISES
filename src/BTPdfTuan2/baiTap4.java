/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan2;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class baiTap4 {
    public Scanner sc = new Scanner(System.in);
    private baiTap1 ds[];
    private int n;
    
    
    public void nhap_ds(){
        System.out.print("So luong hoc sinh can nhap vao: ");
        n = sc.nextInt();
        ds = new baiTap1[n];
        for(int i=0;i<n;i++){
            ds[i] = new baiTap1();
            System.out.println("Nhap hoc sinh thu " +(i+1));
            ds[i].input();
        }
    }
    public void xuat_ds(){
        for(int i=0;i<n;i++){
            System.out.print((i+1)+ ". ");
            ds[i].output();
            ds[i].rank();
        }        
    }
    public void hoanvi(int a, int b){
        baiTap1 temp;
        temp = ds[a];
        ds[a] = ds[b];
        ds[b] = temp;
    }
    public void sapXepDTB(){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ds[i].getDTB()<ds[j].getDTB()){
                    hoanvi(i,j);
                }                    
            }
        }
        xuat_ds();
    }
}
class Demo{
    public static void main(String[] args) {             
        baiTap4 x = new baiTap4();
        
        x.nhap_ds();
        System.out.print("/////DANH SACH HOC SINH/////\n");
        x.sapXepDTB();
    }
}
