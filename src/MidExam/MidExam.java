/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author hocvien
 */
abstract class HOCPHI{
    public abstract long tinhHocPhi();
}

class HOCVIEN extends HOCPHI {
    String mahv;
    String hoten;
    int tongtinchi;
    String email;

    public HOCVIEN() {}
    public HOCVIEN(String mahv, String hoten, int tongtinchi, String email) {
        this.mahv = mahv;
        this.hoten = hoten;
        this.tongtinchi = tongtinchi;
        this.email = email;
    }
    
    public String getMahv() {
        return mahv;
    }

    public void setMahv(String mahv) {
        this.mahv = mahv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTongtinchi() {
        return tongtinchi;
    }

    public void setTongtinchi(int tongtinchi) {
        this.tongtinchi = tongtinchi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    Scanner sc = new Scanner(System.in);
    
    public void nhap(){
        System.out.print("Nhap Ma hoc vien: ");
        setMahv(sc.nextLine());
        System.out.print("Nhap Ho ten: ");
        setHoten(sc.nextLine());
        System.out.print("Nhap Tong so tin chi: ");
        setTongtinchi(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap Email: ");
        setEmail(sc.nextLine());
    }
    public void xuat(){
        System.out.println("\tMa hoc vien: " +getMahv());
        System.out.println("\tHo ten: " +getHoten());
        System.out.println("\tTong so tin chi: " +getTongtinchi());
        System.out.println("\tEmail: " +getEmail());
    }
    
    @Override
    public long tinhHocPhi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class HV_THUD extends HOCVIEN{
    long dongia;

    public HV_THUD() {}
    public HV_THUD(int dongia, String mahv, String hoten, int tongtinchi, String email) {
        super(mahv, hoten, tongtinchi, email);
        this.dongia = dongia;
    }

    public long getDongia() {
        return dongia;
    }
    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public void xuatHV_THUD(){
        super.xuat();
        System.out.println(tinhHocPhi());
    }
    
    @Override
    public long tinhHocPhi() {
        System.out.print("Hoc phi: ");
//        setDongia(95000);
        return getTongtinchi()*95000;
    }
}

class HV_THQL extends HOCVIEN{
    int dongia;

    public HV_THQL() {}
    public HV_THQL(int dongia, String mahv, String hoten, int tongtinchi, String email) {
        super(mahv, hoten, tongtinchi, email);
        this.dongia = dongia;
    }

    public int getDongia() {
        return dongia;
    }
    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
    public void xuatHV_THQL(){
        super.xuat();
        System.out.println(tinhHocPhi());
    }
    
    
    @Override
    public long tinhHocPhi() {
        System.out.print("Hoc phi: ");
//        setDongia(105000);
        return getTongtinchi()*105000;
    }
}

class XuLy{
    Vector v = new Vector();
    int chon;
    Scanner sc = new Scanner(System.in);
    
    public void nhapDS(){
        do{
            System.out.print("1. Nhap Hoc vien Tin hoc ung dung\n2. Nhap Hoc vien Tin hoc quan ly\n0. Thoat\nChon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: 
                    HV_THUD thud = new HV_THUD();
                    thud.nhap();
                    v.add(thud);
                    break;             
                case 2: 
                    HV_THQL thql = new HV_THQL();
                    thql.nhap();
                    v.add(thql);
                    break;
                default:
                    chon=0; break;
            }
        }while(chon!=0);    
    }
    public void xuatDS(){
        do{
            System.out.print("1. Xuat Hoc vien Tin hoc ung dung\n2. Xuat Hoc vien Tin hoc quan ly\n0. Thoat\nChon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: 
                    System.out.println("---DSHV NGANH TIN HOC UNG DUNG---");
                    for(int i=0;i<v.size();i++){
                        if(v.get(i) instanceof HV_THUD){
                            HV_THUD x = (HV_THUD) v.get(i);
                            x.xuatHV_THUD();
                        }
                    }
                    break;
                case 2:
                    System.out.println("---DSHV NGANH TIN HOC QUAN LY---");
                    for(int i=0;i<v.size();i++){
                        if(v.get(i) instanceof HV_THQL){
                            HV_THQL x = (HV_THQL) v.get(i);
                            x.xuatHV_THQL();
                        }
                    }
                    break;
                default:
                    chon=0; break;
            }
        }while(chon!=0);
    }  
    
    public void tinhTongHocPhi(){
        for(int i=0;i<v.size();i++){
            if(v.get(i) instanceof HV_THUD){
                HV_THUD x = (HV_THUD) v.get(i);
                System.out.print("Tong hoc phi Nganh THUD: ");
                long sum = 0;
                sum += x.tinhHocPhi();
                System.out.println(sum);
            }
            else{
                HV_THQL x = (HV_THQL) v.get(i);
                System.out.print("Tong hoc phi Nganh TH: ");
                long sum = 0;
                sum += x.tinhHocPhi();
                System.out.println(sum);
            }
        }
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        XuLy dshv = new XuLy();
        int choice;
        do{
            System.out.println("1. NHAP HOC VIEN THEO CHUYEN NGHANH\n2. XUAT DANH SACH HOC VIEN THEO CHUYEN NGANH\n3. XUAT TONG TIEN THU HOC PHI THEO CHUYEN NGANH\n4. SAP XEP HOC VIEN THEO HOC PHI GIAM DAN\n5. THONG TIN HOC VIEN DUOC GIAM HOC PHI\n0. Thoat");     
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    dshv.nhapDS();
                    break;
                case 2:
                    dshv.xuatDS();
                    break;
                case 3:
                    dshv.tinhTongHocPhi();
                case 4:

                case 5:

                default:
                    choice=0; break;
            }
        }while(choice!=0);
    }
}