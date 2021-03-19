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
public class COODINATE {
    float x;
    float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public COODINATE() {
        this.x = 0;
        this.y = 0;
    }
    public COODINATE(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Scanner sc = new Scanner(System.in);
    public void nhapToaDo(){
        System.out.print("\tNhap x: ");
        this.x = sc.nextFloat();
        System.out.print("\tNhap y: ");
        this.y = sc.nextFloat();
    }
    public void xuatToaDo(){
        System.out.println("(" +this.x+ ", " +this.y+ ")");
    }
    public void tinhTong(COODINATE a, COODINATE b){
        COODINATE kq = new COODINATE();
        kq.x = a.x + b.x;
        kq.y = a.y + b.y;
        System.out.println("Tong toa do cua 2 diem la: (" +kq.x+ ", " +kq.y+ ")");
    }
    public void doiXung(COODINATE a){
        COODINATE kq = new COODINATE();
        kq.x = -a.x;
        kq.y = -a.y;
        System.out.println("(" +kq.x+ ", " +kq.y+ ")");
    }
    public static void main(String[] args) {
        COODINATE a = new COODINATE(2, -3);
        System.out.print("Toa do diem A: ");
        a.xuatToaDo();
        System.out.print("Toa do doi xung voi A: ");
        a.doiXung(a);
        
        COODINATE b = new COODINATE();
        System.out.println("Nhap toa do thu 2: ");
        b.nhapToaDo();
        System.out.print("Toa do diem B: ");
        b.xuatToaDo();
        System.out.print("Toa do doi xung voi B: ");
        b.doiXung(b);
        
        System.out.println("Tong 2 toa do A va B: ");
        COODINATE c = new COODINATE();
        c.tinhTong(a, b);        
    }
}
