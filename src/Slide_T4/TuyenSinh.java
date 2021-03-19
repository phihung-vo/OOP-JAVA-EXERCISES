/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide_T4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class TuyenSinh {
    String sbd;
    String hoten;
    String diachi;
    int uutien;

    public TuyenSinh() {}
    public TuyenSinh(String sbd, String hoten, String diachi, int uutien) {
        this.sbd = sbd;
        this.hoten = hoten;
        this.diachi = diachi;
        this.uutien = uutien;
    }

    public String getSbd() {
        return sbd;
    }
    public void setSbd(String sbd) {
        this.sbd = sbd;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public int getUutien() {
        return uutien;
    }
    public void setUutien(int uutien) {
        this.uutien = uutien;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.print("\tNhap SBD: ");
        setSbd(sc.nextLine());
        System.out.print("\tNhap Ho ten: ");
        setHoten(sc.nextLine());
        System.out.print("\tNhap Dia chi: ");
        setDiachi(sc.nextLine());
        System.out.println("\tNhap Khu vuc uu tien: ");
        System.out.println("\t  Khong duoc uu tien (nhap: 0)\n\t  Khu vuc 1 (nhap: 1)\n\t  Khu vuc 2 (nhap 2)\n\t  Khu vuc 3 (nhap: 3)");
        System.out.print("\t  -->Nhap: ");
        int y = sc.nextInt();
        setUutien(y);
        sc.nextLine();
    }
    public void xuat(){
        System.out.println("\tSBD: " +getSbd());
        System.out.println("\tHo ten: " +getHoten());
        System.out.println("\tDia chi: " +getDiachi());
        System.out.print("\tKhu vuc uu tien: ");
        if(getUutien()==0){
            System.out.println("Khong uu tien");
        }
        else if(getUutien()==1){
            System.out.println("KV" +getUutien());
        }
        else if(getUutien()==2){
            System.out.println("KV" +getUutien());
        }
        else if(getUutien()==3){
            System.out.println("KV" +getUutien());
        }   
    }
}

class TSK_A extends TuyenSinh{
    float diemToan;
    float diemLy;
    float diemHoa;

    public TSK_A() {}
    public TSK_A(float diemToan, float diemLy, float diemHoa, String sbd, String hoten, String diachi, int uutien) {
        super(sbd, hoten, diachi, uutien);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public float getDiemToan() {
        return diemToan;
    }
    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }
    public float getDiemLy() {
        return diemLy;
    }
    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }
    public float getDiemHoa() {
        return diemHoa;
    }
    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    
    public void nhapTSK_A(){
        nhap();
        System.out.print("\tNhap Diem Toan: ");
        setDiemToan(sc.nextFloat());
        System.out.print("\tNhap Diem Ly: ");
        setDiemLy(sc.nextFloat());
        System.out.print("\tNhap Diem Hoa: ");
        setDiemHoa(sc.nextFloat());
    }
   
   
    public void xuatTSK_A(){
        xuat();
        System.out.println("\tDiem: Toan " +getDiemToan()+ "; Ly " +getDiemLy()+ "; Hoa " +getDiemHoa());
    }
}

class TSK_B extends TuyenSinh{
    float diemToan;
    float diemHoa;
    float diemSinh;
    
    public TSK_B() {}
    public TSK_B(float diemToan, float diemHoa, float diemSinh, String sbd, String hoten, String diachi, int uutien) {
        super(sbd, hoten, diachi, uutien);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemSinh = diemSinh;
    }

    public float getDiemToan() {
        return diemToan;
    }
    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }
    public float getDiemHoa() {
        return diemHoa;
    }
    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
    public float getDiemSinh() {
        return diemSinh;
    }
    public void setDiemSinh(float diemSinh) {
        this.diemSinh = diemSinh;
    }
    
    public void nhapTSK_B(){
        nhap();
        System.out.print("\tNhap Diem Toan: ");
        setDiemToan(sc.nextFloat());
        System.out.print("\tNhap Diem Hoa: ");
        setDiemHoa(sc.nextFloat());
        System.out.print("\tNhap Diem Sinh: ");
        setDiemSinh(sc.nextFloat());
    }
    public void xuatTSK_B(){
        xuat();
        System.out.println("\tDiem: Toan " +getDiemToan()+ "; Hoa " +getDiemHoa()+ "; Sinh " +getDiemSinh());
    }
}

class TSK_C extends TuyenSinh{
    float diemVan;
    float diemSu;
    float diemDia;

    public TSK_C() {}
    public TSK_C(float diemVan, float diemSu, float diemDia, String sbd, String hoten, String diachi, int uutien) {
        super(sbd, hoten, diachi, uutien);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public float getDiemVan() {
        return diemVan;
    }
    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }
    public float getDiemSu() {
        return diemSu;
    }
    public void setDiemSu(float diemSu) {
        this.diemSu = diemSu;
    }
    public float getDiemDia() {
        return diemDia;
    }
    public void setDiemDia(float diemDia) {
        this.diemDia = diemDia;
    }
    
    public void nhapTSK_C(){
        nhap();
        System.out.print("\tNhap Diem Van: ");
        setDiemVan(sc.nextFloat());
        System.out.print("\tNhap Diem Su: ");
        setDiemSu(sc.nextFloat());
        System.out.print("\tNhap Diem Dia: ");
        setDiemDia(sc.nextFloat());
    }
    public void xuatTSK_C(){
        xuat();
        System.out.println("\tDiem: Van " +getDiemVan()+ "; Su " +getDiemSu()+ "; Dia " +getDiemDia());
    }
    
}
class MAIN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        ArrayList h = new ArrayList();
        byte chon;
        do{
            System.out.print("1. NHAP DANH SACH CAC SINH VIEN\n2. XUAT DANH SACH THI SINH THEO KHOI THI\n3. TIM KIEM THEO SO BAO DANH\n4. TIM KIEM THEO KHOI THI\n5. SAP TANG THEO SO BAO DANH\n6. TONG SO THI SINH THI THEO KHOI\n0. THOAT\nCHON: ");
            chon = sc.nextByte();
            sc.nextLine();
            switch(chon){
                case 1:
                    System.out.print("SO LUONG THI SINH CAN NHAP VAO: ");
                    int sl = sc.nextInt();
                    for(int i=0;i<sl;i++){
                        System.out.println("Thi sinh thu " +(i+1)+ ":");
                        System.out.print("1. Nhap thi sinh khoi A\n2. Nhap thi sinh khoi B\n3. Nhap thi sinh khoi C\nChon: ");
                        byte choice = sc.nextByte();
                        switch(choice){
                            case 1:
                                TSK_A dsa = new TSK_A();
                                dsa.nhapTSK_A();
                                h.add(dsa);
                                break;
                            case 2:
                                TSK_B dsb = new TSK_B();
                                dsb.nhapTSK_B();
                                h.add(dsb);
                                break;
                            case 3: 
                                TSK_C dsc = new TSK_C();
                                dsc.nhapTSK_C();
                                h.add(dsc);
                                break;
                            default:
                                choice=0; break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("---XUAT DANH SACH THI SINH---");
                    System.out.print("1. Xuat danh sach thi sinh khoi A\n2. Xuat danh sach thi sinh khoi B\n3. Xuat danh sach thi sinh khoi C\nChon: ");
                    byte choice0 = sc.nextByte();
                    switch(choice0){
                        case 1:
                            System.out.println("DANH SACH THI SINH DU THI KHOI A");
                            for(int i=0;i<h.size();i++){
                                System.out.print((i+1)+ ".");
                                if(h.get(i) instanceof TSK_A){
                                    TSK_A x = (TSK_A) h.get(i);
                                    x.xuatTSK_A();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("DANH SACH THI SINH DU THI KHOI B");
                            for(int i=0;i<h.size();i++){
                                System.out.print((i+1)+ ".");
                                if(h.get(i) instanceof TSK_B){
                                    TSK_B x = (TSK_B) h.get(i);
                                    x.xuatTSK_B();
                                }
                            }
                            break;
                        case 3:
                            System.out.println("DANH SACH THI SINH DU THI KHOI C");
                            for(int i=0;i<h.size();i++){
                                System.out.print((i+1)+ ".");
                                if(h.get(i) instanceof TSK_C){
                                    TSK_C x = (TSK_C) h.get(i);
                                    x.xuatTSK_C();
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Nhap SBD can tim: ");
                    String sbd = sc.nextLine();

                    for(int i=0;i<h.size();i++){
                        if(h.get(i) instanceof TSK_A){
                            TSK_A x = (TSK_A) h.get(i);
                            if(x.getSbd().equals(sbd)){
                                x.xuatTSK_A();
                            }
                        }
                        else if(h.get(i) instanceof TSK_B){
                            TSK_B x = (TSK_B) h.get(i);
                            if(x.getSbd().equals(sbd)){
                                x.xuatTSK_B();
                            }
                        }
                        else if(h.get(i) instanceof TSK_C){
                            TSK_C x = (TSK_C) h.get(i);
                            if(x.getSbd().equals(sbd)){
                                x.xuatTSK_C();
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 4: 

                case 5:

                case 6:

                default:
                    chon=0; break;

            }
        }while(chon!=0);     
    }
}