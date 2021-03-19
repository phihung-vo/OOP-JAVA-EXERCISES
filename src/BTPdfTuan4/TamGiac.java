/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan4;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class TamGiac {
    private float c1;
    private float c2;
    private float c3;

    public float getC1() {
        return c1;
    }

    public void setC1(float c1) {
        this.c1 = c1;
    }

    public float getC2() {
        return c2;
    }

    public void setC2(float c2) {
        this.c2 = c2;
    }

    public float getC3() {
        return c3;
    }

    public void setC3(float c3) {
        this.c3 = c3;
    }    
    TamGiac(float canh1, float canh2, float canh3) {
        this.c1 = canh1;
        this.c2 = canh2;
        this.c3 = canh3;
    }
    
    public Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap canh 1: ");
        setC1(sc.nextFloat());
        System.out.print("Nhap canh 2: ");
        setC2(sc.nextFloat());
        System.out.print("Nhap canh 3: ");
        setC3(sc.nextFloat());
    }
    public float chuVi(){
        return c1+c2+c3;
    }
    public double dienTich(){
        float halfP = chuVi()/2;
        float temp = (halfP-c1)*(halfP-c2)*(halfP-c3);
        double herong = Math.sqrt(temp);
        System.out.println(herong);
        return herong;
    }
    public void xacDinh(){
        if((Math.pow(c1,2) + Math.pow(c2, 2)) == Math.pow(c3, 2) || (Math.pow(c2,2) + Math.pow(c3, 2)) == Math.pow(c1, 2) ||(Math.pow(c1,2) + Math.pow(c3,2)) == Math.pow(c2,2)){
            System.out.println("\nTam giac vuong");
        }           
        else if(c1==c2&&c2==c3&&c3==c1){
            System.out.println("\nTam giac deu");
        }
        else if (c1 == c2 || c1 ==c3||c2==c3) {
            System.out.println("\nTam giac can");
        }           
    }
}
class Driver{
    public static void main(String[] args) {
        TamGiac tg = new TamGiac(3,3,5);
        System.out.print("Chu vi tam giac: " +tg.chuVi());
        
        System.out.print("Dien tich tam giac: " +tg.dienTich());
        
        tg.xacDinh();
    }
}
