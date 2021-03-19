/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan8;

import static java.lang.Math.*;
import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
interface HINH {
    public static final float pi = (float) 3.14;
    public void nhap();
    public void xuat();
    public float dienTich();
    Scanner sc = new Scanner(System.in);
}

class HINHVUONG implements HINH{
    private float canh;

    public HINHVUONG() {}
    public HINHVUONG(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }
    public void setCanh(float canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap Do dai canh HV (cm): ");
        setCanh(sc.nextFloat());
    }  
    @Override
    public float dienTich() {
        System.out.print("\tDien tich: ");
        return (float) pow(getCanh(),2);
    }
    @Override
    public void xuat() {
         System.out.println("\tHV canh: " +getCanh());
        System.out.println(dienTich());
    }
}

class HINHCN implements HINH{
    private float dai;
    private float rong;

    public HINHCN() {}
    public HINHCN(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }
    public void setDai(float dai) {
        this.dai = dai;
    }
    public float getRong() {
        return rong;
    }
    public void setRong(float rong) {
        this.rong = rong;
    }
    
    @Override
    public void nhap() {
        System.out.print("Nhap Chieu dai HCN: ");
        setDai(sc.nextFloat());
        System.out.print("Nhap Chieu rong HCN: ");
        setRong(sc.nextFloat());
    }
    @Override
    public float dienTich() {
        System.out.print("\tDien tich: ");
        return getDai()*getRong();
    }
    @Override
    public void xuat() {
        System.out.println("\tHCN dai: " +getDai());
        System.out.println("\tHCN rong: " +getRong());
        System.out.println(dienTich());
    }
}

class HINHTRON implements HINH{
    private float bankinh;

    public HINHTRON() {}
    public HINHTRON(float bankinh) {
        this.bankinh = bankinh;
    }

    public float getBankinh() {
        return bankinh;
    }
    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }
    
    @Override
    public void nhap() {
        System.out.print("Nhap Ban kinh HTron: ");
        setBankinh(sc.nextFloat());
    }
    @Override
    public float dienTich() {
        System.out.print("\tDien tich: ");
        return (float) ((float) pi*pow(getBankinh(), 2));
    }
    @Override
    public void xuat() {
        System.out.println("\tHTron ban kinh: " +getBankinh());
        System.out.println(dienTich());
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("So luong hinh can nhap vao: ");
        int n = sc.nextInt();
        
        HINH ds[] = new HINH[n];
        
        for(int i=0;i<n;i++){
            System.out.println("Hinh " +(i+1)+ ":");
            System.out.println("1. HINH VUONG\n2. HINH CHU NHAT\n3. HINH TRON");
            System.out.print("Chon loai hinh can nhap: ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    ds[i] = new HINHVUONG();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i] = new HINHCN();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i] = new HINHTRON();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren!");
                    break;
            }
        }
        System.out.println("---DANH SACH CAC HINH---");
        for(int j=0;j<n;j++){
            System.out.print((j+1)+ ":");
            ds[j].xuat();
        }
    }
}