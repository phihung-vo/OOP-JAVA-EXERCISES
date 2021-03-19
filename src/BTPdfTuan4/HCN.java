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
public class HCN {
    private float cd;
    private float cr;

    public float getCd() {
        return cd;
    }
    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }
    public void setCr(float cr) {
        this.cr = cr;
    }
    
    HCN() {
        this.cd = 1;
        this.cr = 1;
    }
    HCN(float n){
        this.cd = n;
        this.cr = n;
    }
    HCN(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }
    
    public Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.print(" Nhap chieu dai: ");
        setCd(sc.nextInt());
        System.out.print(" Nhap chieu rong: ");
        setCr(sc.nextInt());
    }
    public void xuat(){
        System.out.println("\tDai: " +getCd());
        System.out.println("\tRong: " +getCr());
    }
    public void chuVi(){
        float x = (this.cd + this.cr)*2;
        System.out.println(x);
    }
    public void dienTich(){        
        float x = this.cd*this.cr;
        System.out.println(x);
    }
}
class DEMO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HCN h1 = new HCN();
        System.out.println("Hinh chu nhat khong tham so: ");
        System.out.print("\tChu vi: ");
        h1.chuVi();
        System.out.print("\tDien tich: ");
        h1.dienTich();
        
        System.out.print("Nhap do dai 1 canh cua hinh vuong: ");        
        float n = sc.nextInt();
        HCN h2 = new HCN(n);
        System.out.print("\tChu vi hinh vuong: ");
        h2.chuVi();
        System.out.print("\tDien tich hinh vuong: ");
        h2.dienTich();
        
        System.out.print("Nhap chieu dai HCN: ");
        float d = sc.nextInt();
        System.out.print("Nhap chieu rong HCN: ");
        float r = sc.nextInt();
        HCN h3 = new HCN(d,r);
        System.out.print("\tChu vi: ");
        h3.chuVi();
        System.out.print("\tDien tich: ");
        h3.dienTich();
    }
}