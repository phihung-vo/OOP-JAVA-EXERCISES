/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan3;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class PHANSO {
    private int tu;
    private int mau;

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public Scanner sc = new Scanner(System.in);

    public PHANSO() {
        tu = 0;
        mau = 1;
    }
    public PHANSO(int t, int m) {
        tu = t;  mau = m;
    }
    public PHANSO(PHANSO p){
        this.tu = p.tu;
        this.mau = p.mau;
    }
    public void nhapPS(){
        System.out.print("\tNhap tu: ");
        tu = sc.nextInt();
        System.out.print("\tNhap mau: ");
        mau = sc.nextInt();            
        if(mau==0){
            System.out.println("\tMau phai khac 0. Vui long nhap lai!");
            System.out.println("\tMau = ");
            mau = sc.nextInt();
        }
    }
    public void xuatPS(){
        if(getTu()==getMau()){
            System.out.println("Phan so la: " +1);
        }
        if(getTu()>0){
            if(getMau()>0){
                System.out.println("Phan so la: " + getTu() + "/" + getMau());
            }
            else if(getMau()<0){
                System.out.println("Phan so la: " + -getTu() + "/" + getMau());
            }
        }
        else if(getTu()==0){
            System.out.println("Phan so la: " +0);
        }
        else{
            if(getMau()>0){
                System.out.println("Phan so la: " + -getTu() + "/" + getMau());
            }
            else if(getMau()<0){
                System.out.println("Phan so la: " + getTu() + "/" + getMau());
            }
        }
    }
    
    public int ucln(int a, int b){
        while(a!=b&&b!=0){
            if(a>b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
    public void rutGon(){
        int temp = ucln(tu, mau);
        tu = tu/temp;
        mau = mau/temp;
    }
    public void cong(PHANSO a, PHANSO b){
        PHANSO kq = new PHANSO();
        kq.tu = a.tu*b.mau + b.tu*a.mau;
        kq.mau = a.mau*b.mau;
        kq.rutGon();
        xuatPS();
    }
    public void tru(PHANSO a, PHANSO b){
        PHANSO kq = new PHANSO();
        kq.tu = a.tu*b.mau - b.tu*a.mau;
        kq.mau = a.mau*b.mau;
        kq.rutGon();
        xuatPS();
    }
    public void nhan(PHANSO a, PHANSO b){
        PHANSO kq = new PHANSO();
        kq.tu = a.tu*b.tu;
        kq.mau = a.mau*b.mau;
        kq.rutGon();
        xuatPS();
    }
    public void chia(PHANSO a, PHANSO b){
        PHANSO kq = new PHANSO();
        kq.tu = a.tu*b.mau;
        kq.mau = a.mau*b.tu;
        kq.rutGon();
        xuatPS();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PHANSO p = new PHANSO();
        PHANSO p1 = new PHANSO();
        PHANSO p2 = new PHANSO();
        System.out.println(" 1. Nhap  va xuat 1 phan so");
        System.out.println(" 2. Cong 2 phan so");
        System.out.println(" 3. Tru 2 phan so");
        System.out.println(" 4. Nhan 2 phan so");
        System.out.println(" 5. Chia 2 phan so");
        System.out.print("Nhap lua chon: ");
        int choice;        
        switch(choice = sc.nextInt()){
            case 1:
                p.nhapPS();
                p.xuatPS();
                break;
            case 2: 
                System.out.println("Cong 2 phan so: ");
                System.out.println("Nhap phan so thu nhat: ");
                p1.nhapPS();
                System.out.println("Nhap phan so thu hai: ");
                p2.nhapPS();
                p.cong(p1, p2);
                break;
            case 3:
                System.out.println("Tru 2 phan so: ");
                System.out.println("Nhap phan so thu nhat: ");
                p1.nhapPS();
                System.out.println("Nhap phan so thu hai: ");
                p2.nhapPS();
                p.tru(p1, p2);
                break;
            case 4:
                System.out.println("Nhan 2 phan so: ");
                System.out.println("Nhap phan so thu nhat: ");
                p1.nhapPS();
                System.out.println("Nhap phan so thu hai: ");
                p2.nhapPS();
                p.nhan(p1, p2);
                break;
            case 5:
                System.out.println("Chia 2 phan so: ");
                System.out.println("Nhap phan so thu nhat: ");
                p1.nhapPS();
                System.out.println("Nhap phan so thu hai: ");
                p2.nhapPS();
                p.chia(p1, p2);
                break;
        }
    }
}
