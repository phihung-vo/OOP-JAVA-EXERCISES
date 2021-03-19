/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class DSHH_ArrayList {
    ArrayList h = new ArrayList();

    public ArrayList getH() {
        return h;
    }
    public void setH(ArrayList h) {
        this.h = h;
    }
 
    Scanner sc = new Scanner(System.in);
    
    public void themHH(){    
        System.out.print("So luong san pham can nhap vao: "); 
        int slmh = sc.nextInt();
             
        for(int i=0;i<slmh;i++){
            System.out.print("SAN PHAM " +(i+1)+ ":\tHang DIEN MAY(nhap 1) / 2.Hang THUC PHAM(nhap 2) --> Chon: ");
            byte chon = sc.nextByte();
            switch(chon){
                case 1:     
                    HANGDM hdm = new HANGDM();
                    hdm.nhapDM();
                    h.add(hdm);
                    break;
                case 2:
                    HANGTP htp = new HANGTP();
                    htp.nhapTP();
                    h.add(htp);
                    break;
            }   
        }
    }
    public void xuatHH(){
        System.out.println("\t1. Xuat hang DIEN MAY\n\t2. Xuat hang THUC PHAM");
        System.out.print("Chon: ");
        byte chon = sc.nextByte();
        switch(chon){
            case 1:
                System.out.println("---DANH SACH DIEN MAY---");
                for(int i=0;i<h.size();i++){
                    if(h.get(i) instanceof HANGDM){
                        System.out.print((i+1)+ ":");
                        HANGDM x = (HANGDM) h.get(i);
                        x.xuatDM();
                    }
                }
                break;
            case 2: 
                System.out.println("---DANH SACH THUC PHAM---");
                for(int i=0;i<h.size();i++){
                    if(h.get(i) instanceof HANGTP){
                        System.out.print((i+1)+ ":");
                        HANGTP x = (HANGTP) h.get(i);
                        x.xuatTP();
                    }                      
                }
                break;
        }        
    }
    
    public static void main(String[] args) {
        DSHH_ArrayList dsarr = new DSHH_ArrayList();
        byte chon;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n1: THEM HANG HOA VAO DANH SACH THEO LOAI");
            System.out.println("2: XUAT DANH SACH HANG HOA THEO LOAI");
            System.out.println("0: Thoat");
            System.out.print("Chon chuc nang: "); chon = sc.nextByte();
            switch(chon){
                case 1:                    
                    dsarr.themHH();
                    break;
                case 2:              
                    dsarr.xuatHH();
                    break;
                default:
                    chon=0; break;
            }
        }while(chon!=0);
    }
}
