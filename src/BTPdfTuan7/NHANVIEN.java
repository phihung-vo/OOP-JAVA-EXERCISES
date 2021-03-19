/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan7;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
abstract class NHANVIEN {
    private String manv, tennv, trinhdo;
    private long lcb;
    abstract long tinhLuong();
    
    public NHANVIEN() {}
    public NHANVIEN(String Manv, String Tennv, String Trinhdo, long Lcb) {
        this.manv = Manv;
        this.tennv = Tennv;
        this.trinhdo = Trinhdo;
        this.lcb = Lcb;
    }

    public String getManv() {
        return manv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public String getTennv() {
        return tennv;
    }
    public void setTennv(String tennv) {
        this.tennv = tennv;
    }
    public String getTrinhdo() {
        return trinhdo;
    }
    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public long getLcb() {
        return lcb;
    }
    public void setLcb(long lcb) {
        this.lcb = lcb;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void nhapNV(){
        System.out.print("Nhap Ma NV: ");
        setManv(sc.nextLine());
        System.out.print("Nhap Ten NV: ");
        setTennv(sc.nextLine());
        System.out.print("Nhap Trinh do: ");
        setTrinhdo(sc.nextLine());
        System.out.print("Nhap Luong co ban: ");
        setLcb(sc.nextLong());
        sc.nextLine();
    }
    public void xuatNV(){
        System.out.println("\tMa NV: " +getManv());
        System.out.println("\tTen NV: " +getTennv());
        System.out.println("\tTrinh do: " +getTrinhdo());
        System.out.println("\tLuong co ban: " +getLcb());
    }
}

class NVQL extends NHANVIEN{
    String chuyenmon;
    private long phucapcv;

    public NVQL() {}
    public NVQL(String Manv, String Tennv, String Trinhdo, long Lcb, String Chuyenmon, long Phucapcv) {
        super(Manv, Tennv, Trinhdo, Lcb);
        this.chuyenmon = Chuyenmon;
        this.phucapcv = Phucapcv;
    }
    public String getChuyenmon() {
        return chuyenmon;
    }
    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }
    public long getPhucapcv() {
        return phucapcv;
    }
    public void setPhucapcv(long phucapcv) {
        this.phucapcv = phucapcv;
    }
    
    public void nhapNVQL(){
        nhapNV();
        System.out.print("Nhap Chuyen mon: ");
        setChuyenmon(sc.nextLine());
        System.out.print("Nhap Phu cap chuc vu: ");
        setPhucapcv(sc.nextLong());
    }
    
    @Override
    long tinhLuong() {
        System.out.print("\tTong luong: ");
        return getLcb() + getPhucapcv();
    }
    public void xuatNVQL(){
        xuatNV();
        System.out.println("\tChuyen mon: " +getChuyenmon());
        System.out.println("\tPhu cap chuc vu: " +getPhucapcv());
        System.out.println(tinhLuong());
    }
}

class NVNC extends NHANVIEN{
    String chuyenmon;
    private long phucapdh;

    public NVNC() {}
    public NVNC(String Manv, String Tennv, String Trinhdo, long Lcb, String Chuyenmon, long Phucapdh) {
        super(Manv, Tennv, Trinhdo, Lcb);
        this.chuyenmon = Chuyenmon;
        this.phucapdh = Phucapdh;
    }
    public String getChuyenmon() {
        return chuyenmon;
    }
    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }
    public long getPhucapdh() {
        return phucapdh;
    }
    public void setPhucapdh(long phucapdh) {
        this.phucapdh = phucapdh;
    }
    
    public void nhapNVNC(){
        nhapNV();
        System.out.print("Nhap Chuyen mon: ");
        setChuyenmon(sc.nextLine());
        System.out.print("Nhap Phu cap doc hai: ");
        setPhucapdh(sc.nextLong());
    }
   
    @Override
    long tinhLuong() {
        System.out.print("\tTong luong: ");
        long x = getLcb() + getPhucapdh();
        return x;
    } 
    public void xuatNVNC(){
        xuatNV();
        System.out.println("\tChuyen mon: " +getChuyenmon());
        System.out.println("\tPhu cap doc hai: " +getPhucapdh());
        System.out.println(tinhLuong());
    }
}

class NVPV extends NHANVIEN{

    public NVPV() {}
    public NVPV(String manv, String tennv, String trinhdo, String chuyenmon, long lcb){
        super(manv, tennv, trinhdo, lcb);
    }
    
    public void nhapNVPV(){
        nhapNV();
    }
    
    @Override
    long tinhLuong() {
        System.out.print("\tTong luong: ");
        return getLcb();
    }
    public void xuatNVPV(){
        xuatNV();
        System.out.println(tinhLuong());
    }
}

class NhanVienDemo{
    public static void main(String[] args) {
        NVQL nvql = new NVQL();
        System.out.println("Nhap NVQL:");
        nvql.nhapNVQL();

        NVNC nvnc = new NVNC();
        System.out.println("Nhap NVNC: ");
        nvnc.nhapNVNC();
        
        NVPV nvpv = new NVPV();
        System.out.println("Nhap NVPV: ");
        nvpv.nhapNVPV();
        
        System.out.println("---DANH SACH NHAN VIEN---");
        System.out.println("1.");
        nvql.xuatNVQL();
        System.out.println("2.");
        nvnc.xuatNVNC();
        System.out.println("3.");
        nvpv.xuatNVPV();
    }
}