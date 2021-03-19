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
public class HANGHOA {
    protected String mhh;
    protected String tenhh;
    protected float gia;

    public String getMhh() {
        return mhh;
    }
    public void setMhh(String mhh) {
        this.mhh = mhh;
    }

    public String getTenhh() {
        return tenhh;
    }
    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }

    public float getGia() {
        return gia;
    }
    public void setGia(float gia) {
        this.gia = gia;
    }

    public HANGHOA() {
    }

    public HANGHOA(String MaHH, String TenHH, float Gia) {
        this.mhh = MaHH;
        this.tenhh = TenHH;
        this.gia = Gia;
    }
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap Ma hang: ");
        setMhh(sc.nextLine());
        System.out.print("Nhap Ten hang: ");
        setTenhh(sc.nextLine());
        System.out.print("Nhap Gia ban (VND): ");
        setGia(sc.nextFloat());
        sc.nextLine();
    }
    public void xuat(){
        System.out.println("\tMa hang: " +getMhh());
        System.out.println("\tTen hang: " +getTenhh());
        System.out.println("\tGia ban: " +getGia()+ "(VND)");
    }
}
class HANGDM extends HANGHOA{
  String bh;
  float da;
  float cs;

    public HANGDM() {
        super();
    }

    public HANGDM(String MaHH, String TenHH, float Gia, String Bh, float Da, float Cs) {
        super(MaHH, TenHH, Gia);
        this.bh = Bh;
        this.da = Da;
        this.cs = Cs;       
    }
    
    public String getBh() {
        return bh;
    }
    public void setBh(String bh) {
        this.bh = bh;
    }

    public float getDa() {
        return da;
    }

    public void setDa(float da) {
        this.da = da;
    }

    public float getCs() {
        return cs;
    }

    public void setCs(float cs) {
        this.cs = cs;
    }   
    public void nhapDM(){
        nhap();
        System.out.print("Nhap Thoi gian bao hanh (thang): ");
        setBh(sc.nextLine());
        System.out.print("Nhap Dien ap (V): ");
        setDa(sc.nextFloat());
        System.out.print("Nhap Cong suat (kWh): ");
        setCs(sc.nextFloat());        
    }
    public void xuatDM(){
        xuat();
        System.out.println("\tThoi gian bao hanh: " +getBh()+ " (thang)");
        System.out.println("\tDien ap: " +getDa()+ "(V)");
        System.out.println("\tCong suat: " +getCs()+ "(kWh)");
    }
}
class HANGTP extends HANGHOA{
    String nsx;
    String hsd;

    public HANGTP() {
        super();
    }

    public HANGTP(String MaHH, String TenHH, float Gia, String Sp, String Nsx, String Hsd) {
        super(MaHH, TenHH, Gia);
        this.nsx = Nsx;
        this.hsd = Hsd;
    }    
    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getHsd() {
        return hsd;
    }

    public void setHsd(String hsd) {
        this.hsd = hsd;
    }
    public void nhapTP(){
        nhap();
        System.out.print("Nhap Ngay san xuat: ");
        setNsx(sc.nextLine());
        System.out.print("Nhap Ngay het han: ");
        setHsd(sc.nextLine());
    }
    public void xuatTP(){
        xuat();
        System.out.println("\tNgay san xuat: " +getNsx());
        System.out.println("\tNgay het han: " +getHsd());
    }
}
class Demo{
    public static void main(String[] args) {
        HANGDM dm = new HANGDM();
        System.out.println("Nhap san pham DIEN MAY");
        dm.nhapDM();
        HANGTP tp = new HANGTP();
        System.out.println("Nhap san pham THUC PHAM");
        tp.nhapTP();
        
        System.out.println("---XUAT THONG TIN SAN PHAM---");
        System.out.println("DIEN MAY: ");
        dm.xuatDM();        
        System.out.println("THUC PHAM: ");
        tp.xuatTP();
    }
}