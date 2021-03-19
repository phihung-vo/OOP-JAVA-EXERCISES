/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class PTB2 {
    public static void main(String[] args) {
        double a,b,c,x1,x2,delta;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        
        if(a!=0){
            System.out.print("Nhap b = ");
            b = sc.nextInt();
            System.out.print("Nhap c = ");
            c = sc.nextInt();
            
            String as = a + "x^2";
            String bs = b!=0 ? b + "x":"";
            String cs = c!=0 ? c + "":"";
            if(b>0) bs = "+" + bs;
            if(c>0) cs = "+" + cs;
            System.out.printf("PT: %s %s %s = 0", as,bs,cs);
        
            delta = b*b-4*a*c;
            if(delta>0){
                System.out.println("\nPT co 2 nghiem phan biet:");                
                x1 = (float) (-b + Math.sqrt(delta)/(2*a));
                System.out.println("\tX1 = " + x1);              
                x2 = (float) (-b - Math.sqrt(delta)/(2*a));
                System.out.println("\tX2 = " + x2);       
            }
            else if(delta==0){
                System.out.println("\nPT co nghiem kep: ");
                System.out.println("\tX1 = X2 = " + (float)-b/(2*a));
            }
            else{
                System.out.println("\nPT vo nghiem!");
            }
        }       
    }
}
