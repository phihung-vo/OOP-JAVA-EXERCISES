/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan5;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
class DSHANGHOA {
    HANGDM[] hdm;
    HANGTP[] htp;
    int slmh;

    public int getSlmh() {
        return slmh;
    }
    public void setSlmh(int slmh) {
        this.slmh = slmh;
    }

    public HANGDM[] getHdm() {
        return hdm;
    }

    public void setHdm(HANGDM[] hdm) {
        this.hdm = hdm;
    }

    public HANGTP[] getHtp() {
        return htp;
    }

    public void setHtp(HANGTP[] htp) {
        this.htp = htp;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void themMH(int chon){
        switch(chon){
            case 1:
                System.out.print("So luong san pham can nhap vao: "); 
                slmh = sc.nextInt();
                sc.nextLine();
                hdm = new HANGDM[slmh];
                for(int i=0;i<slmh;i++){
                    System.out.println("DIEN MAY " +(i+1)+ ":");
                    hdm[i] = new HANGDM();
                    hdm[i].nhapDM();
                }
                break;
            case 2:
                System.out.print("So luong san pham can nhap vao: "); 
                slmh = sc.nextInt();
                sc.nextLine();
                htp = new HANGTP[slmh];
                for(int i=0;i<slmh;i++){
                    System.out.println("THUC PHAM " +(i+1)+ ":");
                    htp[i] = new HANGTP();
                    htp[i].nhapTP();
                }
                break;
        }
    }
    
    public void xuatDSTheoLoai(int chon){
        switch(chon){
            case 1:
                System.out.println("---DANH SACH DIEN MAY---");
                for(int i=0;i<hdm.length;i++){
                    System.out.print((i+1)+ ". ");
                    hdm[i].xuatDM();
                }
                break;
            case 2:
                System.out.println("---DANH SACH THUC PHAM---");
                for(int i=0;i<htp.length;i++){
                    System.out.print((i+1)+ ". ");
                    htp[i].xuatTP();
                }
                break;
        }
    }
    
    public static void main(String[] args) {
        DSHANGHOA dshh = new DSHANGHOA();
        int chon;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n1: THEM HANG HOA VAO DANH SACH THEO LOAI");
            System.out.println("2: XUAT DANH SACH HANG HOA THEO LOAI");
            System.out.println("0: Thoat");
            System.out.print("Chon chuc nang: "); chon = sc.nextInt();
            switch(chon){
                case 1:
                    System.out.println("\t1. Hang DIEN MAY\n\t2. Hang THUC PHAM");
                    System.out.print("Chon: ");   chon = sc.nextInt();
                    dshh.themMH(chon);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("\n---Xuat DANH SACH MAT HANG theo loai---");
                    System.out.println("\t1. Xuat hang DIEN MAY\n\t2. Xuat hang THUC PHAM");
                    System.out.print("Chon: ");   chon = sc.nextInt();
                    dshh.xuatDSTheoLoai(chon);
                    break;
                default:
                    chon=0; break;
            }
        }while(chon!=0);
    }
}
