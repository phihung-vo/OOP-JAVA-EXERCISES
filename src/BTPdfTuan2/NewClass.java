package BTPdfTuan2;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package baiTapPdfTuan2;
//
//import java.util.Scanner;
//
///**
// *
// * @author PHI HUNG
// */
//public class NewClass {
//    public Scanner sc = new Scanner(System.in);
//    private String maso;
//    private String hoten;
//    private float dtb;
//    private String xeploai;
//    NewClass arr[];
//    int sl;
//    
//    public void setmaso(String masoIn){
//        this.maso = masoIn;
//    }
//    public String getmaso(){
//        return maso;
//    }
//    
//    public void sethoten(String hotenIn){
//        this.hoten = hotenIn;
//    }
//    public String gethoten(){
//        return hoten;
//    }
//    
//    public void setDTB(float dtbIn){
//        if(dtbIn>=0&&dtbIn<=10){
//            this.dtb = dtbIn;
//        }
//        else{
//            System.out.println("Nhap lai! 0<=DTB<=10");
//            System.out.print("\tDTB = ");
//            dtbIn = sc.nextInt();
//            this.dtb = dtbIn;
//        }        
//    }
//    public float getDTB(){
//        return dtb;
//    }
//    
//    public void setxeploai(String xeploaiIn){
//        this.xeploai = xeploaiIn;
//    }
//    public String getxeploai(){
//        return xeploai;
//    }
//
//    public NewClass[] getArr() {
//        return arr;
//    }
//    public void setArr(NewClass[] arr) {
//        this.arr = arr;
//    }
//
//    public int getSl() {
//        return sl;
//    }
//    public void setSl(int sl) {
//        this.sl = sl;
//    }
//    
//    
//    public void input(){
//        System.out.print("\tNhap ma so hoc sinh: ");
//        setmaso(sc.nextLine());
//        System.out.print("\tNhap ho ten hoc sinh: ");
//        sethoten(sc.nextLine());
//        System.out.print("\tNhap diem trung binh: ");
//        setDTB(sc.nextFloat());
//        sc.nextLine();
//    }
//    public void output(){
//        System.out.println("\tMa so HS: " +getmaso());
//        System.out.println("\tHo ten HS: " +gethoten());
//        System.out.println("\tDTB: " +getDTB());
//    }
//    public void rank(){
//        if(getDTB()<3){  
//            setxeploai("Yeu");
//            System.out.println("\tXep loai: " +getxeploai());
//        }
//        else if(getDTB()>=3&&getDTB()<5){
//            setxeploai("Trung binh");
//            System.out.println("\tXep loai: " +getxeploai());              
//        }
//        else if(getDTB()>=5&&getDTB()<7){
//            setxeploai("Kha");
//            System.out.println("\tXep loai: " +getxeploai());
//        }
//        else if(getDTB()>=7&&getDTB()<8){
//            setxeploai("Tien tien");
//            System.out.println("\tXep loai: " +getxeploai());
//        }
//        else if(getDTB()>=8&&getDTB()<9){
//            setxeploai("Gioi");
//            System.out.println("\tXep loai: " +getxeploai());
//        }
//        else if(getDTB()>=9&&getDTB()<=10){
//            setxeploai("Xuat sac");
//            System.out.println("\tXep loai: " +getxeploai());
//        }
//        System.out.println("");
//    }
//    public void nhap_ds(NewClass arr[], int n){
//        for(int i=0;i<n;i++){
//            arr[i] = new NewClass();
//            System.out.println("Nhap hoc sinh thu " +(i+1));
//            arr[i].input();
//        }
//    }
//    public void xuat_ds(NewClass arr[], int n){
//        for(int i=0;i<n;i++){
//            System.out.print((i+1)+ ". ");
//            arr[i].output();            
//        }        
//    }
//    public void hoanvi(NewClass arr[], int a, int b){
//        NewClass temp;
//        temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//    public void sapXepDTB(NewClass arr[], int n){
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i].getDTB()<arr[j].getDTB()){
//                    hoanvi(arr,i,j);
//                }                    
//            }
//        }
//        xuat_ds(arr, n);
//    }
//}
//class Demo5{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);        
//        System.out.print("So luong hoc sinh can nhap vao: ");
//        int n = sc.nextInt();
//        NewClass[] ds_hocsinh = new NewClass[n];
//        NewClass x = new NewClass();
//        
//        x.nhap_ds(ds_hocsinh, n);
//        System.out.print("/////DANH SACH HOC SINH/////\n");
//        x.sapXepDTB(ds_hocsinh, n);
//    }
//}
