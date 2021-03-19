/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan4;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
class DSHCN extends HCN{
    DSHCN arr[];
    int sl;

    public DSHCN[] getArr() {
        return arr;
    }
    public void setArr(DSHCN[] arr) {
        this.arr = arr;
    }

    public int getSl() {
        return sl;
    }
    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public void nhapDsHcn(DSHCN arr[], int sl){
        for(int i=0;i<sl;i++){
            arr[i] = new DSHCN();
            System.out.println("Nhap HCN thu " +(i+1)+ ":");
            arr[i].nhap();
        }
    }
    public void xuatDsHcn(DSHCN arr[], int sl){
        for(int i=0;i<sl;i++){
            System.out.print("HCN " +(i+1)+ ": ");
            arr[i].xuat();
            System.out.print("\tChu vi: ");
            arr[i].chuVi();
            System.out.print("\tDien tich: ");
            arr[i].dienTich();
        }
    }
}
class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong HCN can nhap vao: ");
        int sl = sc.nextInt();
        DSHCN arr[] = new DSHCN[sl];
        DSHCN x = new DSHCN();
        x.nhapDsHcn(arr, sl);
        System.out.println("///DANH SACH HINH CHU NHAT");
        x.xuatDsHcn(arr, sl);
    }
}
