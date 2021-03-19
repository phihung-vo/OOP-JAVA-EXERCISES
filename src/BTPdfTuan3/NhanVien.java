/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan3;

import java.util.Scanner;
 /*
 * @author PHI HUNG
 */
public class NhanVien {
    String ms;
    String hoten;
    float lcb;
    float hsl;
    int slnv;

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getLcb() {
        return lcb;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public int getSlnv() {
        return slnv;
    }

    public void setSlnv(int slnv) {
        this.slnv = slnv;
    }
    
    public NhanVien() {
        this.ms = "";
        this.hoten = "";
        this.lcb = 0;
        this.hsl = 0;
        this.slnv = 0;
    }
    public NhanVien(String ms, String hoten, float lcb, float hsl) {
        this.ms = ms;
        this.hoten = hoten;
        this.lcb = lcb;
        this.hsl = hsl;
    }
    public NhanVien(NhanVien nv){
        this.ms = nv.ms;
        this.hoten = nv.hoten;
        this.lcb = nv.lcb;
        this.hsl = nv.hsl;
    }
    
    public Scanner sc = new Scanner(System.in);
    public void nhapNv(){
        System.out.print("\tNhap MSNV: ");
        setMs(sc.nextLine());
        System.out.print("\tNhap Ho ten NV: ");
        setHoten(sc.nextLine());
        System.out.print("\tNhap Luong co ban: ");
        setLcb(sc.nextFloat());
        System.out.print("\tNhap He so luong: ");
        setHsl(sc.nextFloat());
    }
    public void xuatNv(){
        System.out.println("\tMSNV: " +getMs());
        System.out.println("\tHo ten NV: " +getHoten());
        System.out.println("\tLuong co ban: " +getLcb());
        System.out.println("\tHe so luong: " +getHsl());
        tinhLuong();
    }
    public void tinhLuong(){
        System.out.print("\tTien luong: ");
        System.out.println(getHsl()*getLcb());
    }
    public void reName(){
        System.out.print("Ban muon doi Ten cua nhan vien nay khong? Co(y)/Khong(n): ");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        if(ch=='Y'||ch=='y'){
            System.out.print("Nhap ten moi: ");
            String newname = sc.nextLine();
            this.hoten = newname;
            setHoten(hoten);
        }
        else if(ch=='N'||ch=='n'){
            exit();
        }
    }
    public void changeHsl(){
        float newhsl;
        System.out.println("Nhap he so luong moi");
        newhsl = sc.nextFloat();
        setHsl(newhsl);
    }
    
    @Override
    public String toString(){
        return getMs()+ " " +getHoten()+ " " +getHsl();
    }

    private void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Demo{
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien();
//        System.out.println("Nhan vien 1:");
//        nv1.xuatNv();
//        
//        NhanVien nv2 = new NhanVien("HC01","Vu Thi Hoai", 2000000, (float) 2.1);
//        System.out.println("Nhan vien 2: ");
//        nv2.xuatNv();
//          
//        System.out.println("Nhap nhan vien 3: ");
//        NhanVien nv3 = new NhanVien();
//        nv3.nhapNv();
//        System.out.println();
//        nv3.xuatNv();
//        
//        System.out.println("Demo RENAME 1 NV:");
//        NhanVien nv_new = new NhanVien(nv3);
//        System.out.println("Nhan vien co san:");
//        nv_new.xuatNv();
//        nv_new.reName();
//        nv_new.xuatNv();
        
        System.out.println("/////NHAP DANH SACH NHAN VIEN/////");
        System.out.print("Nhap so luong nhan vien can nhap vao: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NhanVien[] ds_nv = new NhanVien[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhan vien " +(i+1)+ ":");
            ds_nv[i] = new NhanVien();
            ds_nv[i].nhapNv();
        }
        System.out.println("\n/////DANH SACH NHAN VIEN/////");
        for(int i=0;i<n;i++){
            System.out.print((i+1)+ ".");
            ds_nv[i].xuatNv();
            ds_nv[i].tinhLuong();
        }
        System.out.println("So luong nhan vien trong danh sach la: " +ds_nv.length);
    }
}

