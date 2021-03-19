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
public class baiTap5 {
    public Scanner sc = new Scanner(System.in);
    private int choice, i;
    
    public void tinh(int choice){
//        int num=1;
//        while(num<=10){
//            System.out.println("\t" +choice+ "x" +num+ "=" +(choice*num));
//            num++;
//        }
        for(i=1;i<=10;i++){
            System.out.println("\t" +choice+ "x" +i+ "=" +(choice*i));
        }                
    }
    public void bangCuuChuong(int choice){
        switch(choice){
            case 2: tinh(choice); break;
            case 3: tinh(choice); break;
            case 4: tinh(choice); break;
            case 5: tinh(choice); break;
            case 6: tinh(choice); break;
            case 7: tinh(choice); break;
            case 8: tinh(choice); break;
            case 9: tinh(choice); break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        baiTap5 cuuchuong = new baiTap5();
        System.out.print("Nhap so cua bang cuu chuong: ");
        int choice = sc.nextInt();
        cuuchuong.bangCuuChuong(choice);
    }
}
