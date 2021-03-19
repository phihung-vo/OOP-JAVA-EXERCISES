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
public class baiTap2 {
     private String msv, hoten;
    private int tuoi;
    private float dtb;
    private date ngaysinh = new date();
    private Scanner sc = new Scanner(System.in);
    
    public void nhap1Sv(){
        System.out.print("Nhap MSSV: ");
        msv = sc.nextLine();
        System.out.print("Nhap Ho va ten: ");
        hoten = sc.nextLine();
        System.out.print("Nhap Tuoi: ");        
        tuoi = sc.nextInt();
        System.out.print("Nhap Ngay sinh: ");
        ngaysinh.nhapngay(/*ngaysinh.day, ngaysinh.month, ngaysinh.year*/);
        System.out.print("Nhap DTB: ");
        dtb = sc.nextFloat();       
    }
    public void xuat1Sv(){
        System.out.println("//////THONG TIN SINH VIEN//////");
        System.out.println("MSSV: " + msv);
        System.out.println("Ho va ten: " + hoten);
        System.out.println("Tuoi: " + tuoi);
        ngaysinh.xuatngay();
        System.out.println("\nDTB: " + dtb);
    }
//    public void nhapNhieuSv(NewClass student, NewClass a, int n){  
//        a = new NewClass[n];
//        for(int i=0;i<n;i++){
//            System.out.println("Nhap thong tin SV thu " + (i+1));
//            student.nhap1Sv();
//            a[i]=student.nhap1Sv();
//            sc.nextLine();
//        }
//    }
//    public void xuatNhieuSv(Newclass student, int n){
//        for(int i=0;i<n;i++){
//            System.out.println("SV thu " + (i+1));
//            student.xuat(i);
//        }
//    }
    
    public static void main(String[] args) {       
        baiTap2 student = new baiTap2();
        Scanner sc = new Scanner(System.in);
//      System.out.print("Nhap so luong SV can them thong tin: ");
//      int n = sc.nextInt();
        student.nhap1Sv();
        student.xuat1Sv();
    }
}
class date{
    Scanner sc = new Scanner(System.in);
    private int day, month, year;
    public void nhapngay(){
        System.out.print("\n  Ngay: ");
        day = sc.nextInt();                
        System.out.print("  Thang: ");
        month = sc.nextInt();
        System.out.print("  Nam: ");
        year = sc.nextInt();
    }
    public void xuatngay(){
        System.out.print("Ngay sinh: " + day + "/" + month + "/" + year);
    }     
}
