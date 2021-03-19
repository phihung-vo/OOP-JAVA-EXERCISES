/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan1;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class baiTap6 {
    public Scanner sc = new Scanner(System.in);
    int choice, i;
    public void binhphuong(){
        i=1;
        while(i<=10){
            System.out.println("\t" +i+ "^2 = " +(i*i));
            i++;
        }
    }
    public void lapphuong(){
        i=1;
        while(i<=10){
            System.out.println("\t" +i+ "^3 = " +(i*i*i));
            i++;
        }
    }
    
    public void xuat(){
        System.out.println("Nhap vao lua chon cua ban:\n\t1.Binh phuong\n\t2.Lap phuong");
        choice = sc.nextInt();      
        switch(choice){
            case 1: binhphuong(); break;
            case 2: lapphuong(); break;
        }
    }
    public static void main(String[] args) {
        baiTap6 bp_lp = new baiTap6();
        bp_lp.xuat();
    }
}
