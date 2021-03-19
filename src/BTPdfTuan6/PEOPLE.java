/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan6;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
class NGAY{
    private int ngay, thang, nam;

    public NGAY() {}
    public NGAY(int Ngay, int Thang, int Nam) {
            this.ngay = Ngay;
            this.thang = Thang;
            this.nam = Nam;
    }
    
    public int getNgay() {
            return ngay;
    }
    public void setNgay(int ngay) {
            this.ngay = ngay;
    }
    public int getThang() {
            return thang;
    }
    public void setThang(int thang) {
            this.thang = thang;
    }
    public int getNam() {
            return nam;
    }
    public void setNam(int nam) {
            this.nam = nam;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapDate(){
        System.out.print("\tNgay: ");
        setNgay(sc.nextInt());
        System.out.print("\tThang: ");
        setThang(sc.nextInt());
        System.out.print("\tNam: ");
        setNam(sc.nextInt());
        sc.nextLine();
    }
    public void xuatDate(){
        System.out.println(getNgay()+ "/" +getThang()+ "/" +getNam());
    }
}

class PEOPLE {
    String hoten;
    NGAY ngaysinh = new NGAY();

    public PEOPLE() {}
    public PEOPLE(String Hoten, NGAY Ngaysinh) {
        this.hoten = Hoten;
        this.ngaysinh = Ngaysinh;
    }
    
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public NGAY getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(NGAY ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    Scanner sc = new Scanner(System.in);
    public void nhapPP(){
        System.out.print("Nhap Ho ten: ");
        setHoten(sc.nextLine());
        System.out.println("Nhap Ngay sinh: ");
        ngaysinh.nhapDate();
    }
    public void xuatPP(){
        System.out.println("\tHo ten: " +getHoten());
        System.out.print("\tNgay sinh: " );
        ngaysinh.xuatDate();
    }
}

class HOCVIEN extends PEOPLE{
    private float diem1, diem2, diem3;

    public HOCVIEN() {}
    public HOCVIEN(String Hoten, NGAY Ngaysinh, float Diem1, float Diem2, float Diem3) {
        super(Hoten, Ngaysinh);
        this.diem1 = Diem1;
        this.diem2 = Diem2;
        this.diem3 = Diem3;
    }
    
    public float getDiem1() {
        return diem1;
    }
    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }
    public float getDiem2() {
        return diem2;
    }
    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }
    public float getDiem3() {
        return diem3;
    }
    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    
    public void nhapHV(){
        nhapPP();
        System.out.print("Nhap Diem 1: ");
        setDiem1(sc.nextFloat());
        System.out.print("Nhap Diem 2: ");
        setDiem2(sc.nextFloat());
        System.out.print("Nhap Diem 3: ");
        setDiem3(sc.nextFloat());
        sc.nextLine();
    }
    public void xuatHV(){
        xuatPP();
        System.out.println("\tDiem 1: " +getDiem1());
        System.out.println("\tDiem 2: " +getDiem2());
        System.out.println("\tDiem 3: " +getDiem3());
    }
}

class PHONGBANKHOA{
    String mapbk;
    String tenpbk;

    public PHONGBANKHOA() {}
    public PHONGBANKHOA(String Mapbk, String Tenpbk) {
        this.mapbk = Mapbk;
        this.tenpbk = Tenpbk;
    }

    public String getMapbk() {
        return mapbk;
    }
    public void setMapbk(String mapbk) {
        this.mapbk = mapbk;
    }
    public String getTenpbk() {
        return tenpbk;
    }
    public void setTenpbk(String tenpbk) {
        this.tenpbk = tenpbk;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void nhapPBK(){
        System.out.print("Nhap Ma phong ban: ");
        setMapbk(sc.nextLine());
        System.out.print("Nhap Ten phong ban: ");
        setTenpbk(sc.nextLine());
    }
    public void xuatPBK(){
        System.out.println("\tMa phong ban: " +getMapbk());
        System.out.println("\tTen phong ban: " +getTenpbk());
    }
}

class NHANVIEN extends PEOPLE{
    private float luong;
    private NGAY ngaynhanviec = new NGAY();
    private PHONGBANKHOA pbk = new PHONGBANKHOA();

    public NHANVIEN() {}
    public NHANVIEN(String Hoten, NGAY Ngaysinh, float Luong, NGAY Ngaynhanviec, PHONGBANKHOA Pbk) {
        super(Hoten, Ngaysinh);
        this.luong = Luong;
        this.ngaynhanviec = Ngaynhanviec;
        this.pbk = Pbk;
    }
  
    public float getLuong() {
        return luong;
    }
    public void setLuong(float luong) {
        this.luong = luong;
    }
    public NGAY getNgaynhanviec() {
        return ngaynhanviec;
    }
    public void setNgaynhanviec(NGAY ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }
    public PHONGBANKHOA getPbk() {
        return pbk;
    }
    public void setPbk(PHONGBANKHOA pbk) {
        this.pbk = pbk;
    }
    
    public void nhapNV(){
        nhapPP();
        System.out.print("Nhap Luong: ");
        setLuong(sc.nextFloat());
        System.out.println("Nhap Ngay nhan viec: ");
        ngaynhanviec.nhapDate();
        pbk.nhapPBK();
    }
    public void xuatNV(){
        xuatPP();
        System.out.println("\tLuong: " +getLuong());
        System.out.println("\tNgay nhan viec: " +ngaynhanviec.getNgay()+ "/" +ngaynhanviec.getThang()+ "/" +ngaynhanviec.getNam());
        pbk.xuatPBK();
    }
}

class NVCLC extends NHANVIEN{
    String trinhdo;
    String nganh;
    String noidaotao;

    public NVCLC() {}
    public NVCLC(String Hoten, NGAY Ngaysinh, float Luong, NGAY Ngaynhanviec, PHONGBANKHOA Pbk, String Trinhdo, String Nganh, String Noidaotao) {
        super(Hoten, Ngaysinh, Luong, Ngaynhanviec, Pbk);
        this.trinhdo = Trinhdo;
        this.nganh = Nganh;
        this.noidaotao = Noidaotao;
    }

    public String getTrinhdo() {
        return trinhdo;
    }
    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public String getNoidaotao() {
        return noidaotao;
    }
    public void setNoidaotao(String noidaotao) {
        this.noidaotao = noidaotao;
    }
    
    public void nhapNVCLC(){
        nhapNV();
        sc.nextLine();
        System.out.print("Nhap Trinh do: ");
        setTrinhdo(sc.nextLine());
        System.out.print("Nhap Nganh: ");
        setNganh(sc.nextLine());
        System.out.print("Nhap Noi dao tao: ");
        setNoidaotao(sc.nextLine());
    }
    public void xuatNVCLC(){
        xuatNV();
        System.out.println("\tTrinh do: " +getTrinhdo());
        System.out.println("\tNganh: " +getNganh());
        System.out.println("\tNoi dao tao: " +getNoidaotao());
    }
}

class NVQL extends NVCLC{
    int phucap;

    public NVQL() {}
    public NVQL(String Hoten, NGAY Ngaysinh, float Luong, NGAY Ngaynhanviec, PHONGBANKHOA Pbk, String Trinhdo, String Nganh, String Noidaotao, int Phucap) {
        super(Hoten, Ngaysinh, Luong, Ngaynhanviec, Pbk, Trinhdo, Nganh, Noidaotao);
        this.phucap = Phucap;
    }

    public int getPhucap() {
        return phucap;
    }
    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }
    
    public void nhapNVQL(){
        nhapNVCLC();
        System.out.print("Nhap Phu cap quan ly: ");
        setPhucap(sc.nextInt());
    }
    public void xuatNVQL(){
        xuatNVCLC();
        System.out.println("\tPhu cap quan ly: " +getPhucap());
    }
}

class GIAOVIEN extends NVCLC{
    int thulaogd;

    public GIAOVIEN() {}
    public GIAOVIEN(String Hoten, NGAY Ngaysinh, float Luong, NGAY Ngaynhanviec, PHONGBANKHOA Pbk, String Trinhdo, String Nganh, String Noidaotao, int Thulaogd) {
        super(Hoten, Ngaysinh, Luong, Ngaynhanviec, Pbk, Trinhdo, Nganh, Noidaotao);
        this.thulaogd = Thulaogd;
    }

    public int getThulaogd() {
        return thulaogd;
    }
    public void setThulaogd(int thulaogd) {
        this.thulaogd = thulaogd;
    }
    
    public void nhapGV(){
        nhapNVCLC();
        System.out.print("Nhap Thu lao GD: ");
        setThulaogd(sc.nextInt());
    }
    public void xuatGV(){
        xuatNVCLC();
        System.out.println("\tThu lao GD: " +getThulaogd());
    }
}

class MAIN{
    public static void main(String[] args) {
        HOCVIEN hv = new HOCVIEN();
        NVQL nvql = new NVQL();
        GIAOVIEN gv = new GIAOVIEN();
        
        System.out.println("Nhap 1 Hoc Vien:");
        hv.nhapHV();
        System.out.println("Nhap 1 Nhan Vien Quan Ly:");
        nvql.nhapNVQL();
        System.out.println("Nhap 1 Giao Vien:");
        gv.nhapGV();
        
        System.out.println("---DANH SACH THONG TIN---");
        System.out.println("Hoc Vien:");
        hv.xuatHV();
        System.out.println("Nhan Vien Quan Ly:");
        nvql.xuatNVQL();
        System.out.println("Giao Vien:");
        gv.xuatGV();
    }
}