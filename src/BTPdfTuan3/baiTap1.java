/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan3;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class baiTap1 {
    public Scanner sc = new Scanner(System.in);
    private String maso;
    private String hoten;
    private float dtb;
    private String xeploai;

    baiTap1(String masoIn, String hotenIn, float dtbIn, String xeploaiIn) {
        maso = masoIn;
        hoten = hotenIn;
        dtb = dtbIn;
        xeploai = xeploaiIn;
    }
    
    public void setmaso(String masoIn){
        this.maso = masoIn;
    }
    public String getmaso(){
        return maso;
    }
    
    public void sethoten(String hotenIn){
        this.hoten = hotenIn;
    }
    public String gethoten(){
        return hoten;
    }    
    public void setDTB(float dtbIn){
        if(dtbIn>=0&&dtbIn<=10){
            this.dtb = dtbIn;
        }
        else{
            System.out.println("Nhap lai! 0<=DTB<=10");
            System.out.print("\tDTB = ");
            dtbIn = sc.nextInt();
            this.dtb = dtbIn;
        }        
    }
    public float getDTB(){
        return dtb;
    }    
    public void setxeploai(String xeploaiIn){
        this.xeploai = xeploaiIn;
    }
    public String getxeploai(){
        return xeploai;
    }
    
    public void input(){
        System.out.print("Nhap ma so hoc sinh: ");
        setmaso(sc.nextLine());
        System.out.print("Nhap ho ten hoc sinh: ");
        sethoten(sc.nextLine());
        System.out.print("Nhap diem trung binh: ");
        setDTB(sc.nextFloat());
        sc.nextLine();
    }
    public void output(){
        System.out.println("\tMa so HS: " +getmaso());
        System.out.println("\tHo ten HS: " +gethoten());
        System.out.println("\tDTB: " +getDTB());
    }
    public void rank(){
        if(getDTB()<3){  
            setxeploai("Yeu");
            System.out.println("\tXep loai: " +getxeploai());
        }
        else if(getDTB()>=3&&getDTB()<5){
            setxeploai("Trung binh");
            System.out.println("\tXep loai: " +getxeploai());              
        }
        else if(getDTB()>=5&&getDTB()<7){
            setxeploai("Kha");
            System.out.println("\tXep loai: " +getxeploai());
        }
        else if(getDTB()>=7&&getDTB()<8){
            setxeploai("Tien tien");
            System.out.println("\tXep loai: " +getxeploai());
        }
        else if(getDTB()>=8&&getDTB()<9){
            setxeploai("Gioi");
            System.out.println("\tXep loai: " +getxeploai());
        }
        else if(getDTB()>=9&&getDTB()<=10){
            setxeploai("Xuat sac");
            System.out.println("\tXep loai: " +getxeploai());
        }
        System.out.println("");
    }
    public void rename(String newname){
        hoten = newname;
        sethoten(hoten);
    }
}
class Demo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        baiTap1 x1 = new baiTap1("N17DCATxxx", "Nguyen Van A", (float) 3.5, "Trung binh" );    

//        System.out.println("Nhap hoc sinh");    
//        x1.input();

        System.out.print("/////DANH SACH HOC SINH/////\n");
        x1.output();
        x1.rank();
        
        
        System.out.print("Ban co muon doi ten cua hoc sinh nay khong? Co(y)/Khong(n) ");
        char ch = sc.next().charAt(0);
        sc.nextLine();
        if(ch=='Y'||ch=='y'){
            System.out.print("Nhap ten moi: ");
            String newname;
            newname = sc.nextLine();
            x1.rename(newname);
        }
        else if(ch=='N'||ch=='n'){
            exit();
        }

        System.out.print("Ban co muon nhap them hoc sinh khong? Co(y)/Khong(n) ");
        ch = sc.next().charAt(0);
        if(ch=='Y'||ch=='y'){
            baiTap1 x2 = new baiTap1("N17DCATxxx", "Le Van c", (float) 8, "Gioi");
        }
        else if(ch=='N'||ch=='n'){
            exit();
        }
        baiTap1 x2 = new baiTap1("N17DCATxxx", "Le Van C", (float) 8, "Gioi");
        System.out.print("/////DANH SACH HOC SINH/////\n");
        x1.output();
        System.out.println();
        x2.output();
        if(x1.getDTB()>x2.getDTB()){
            System.out.println("Hoc sinh " +x1.gethoten()+ " co DTB lon hon.");
        }
        else if(x1.getDTB()<x2.getDTB()){
            System.out.println("Hoc sinh " +x2.gethoten()+ " co DTB lon hon.");
        }
    }

    private static void exit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
