/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTPdfTuan2;

import java.util.Scanner;

/**
 *
 * @author PHI HUNG
 */
public class baiTap2 {
    public Scanner sc = new Scanner(System.in);
    private int sophantu;
    private int arr[];
    private int size;

    public void setSophantu(int sophantu) {
        this.sophantu = sophantu;
    }

    public void setMang(int[] arr) {
        this.arr = arr;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSophantu() {
        return sophantu;
    }

    public int[] getMang() {
        return arr;
    }

    public int getSize() {
        return size;
    }
    
    public void input(){
        System.out.print("Nhap so phan tu mang: ");
        sophantu = sc.nextInt();
        arr = new int[sophantu];
        System.out.println("Nhap mang so nguyen:");
        for(int i=0;i<sophantu;i++){
            System.out.print(" a[" +i+ "] = ");
            arr[i] = sc.nextInt();
        }
        setSize(sophantu);
    }
    public void output(){
        System.out.println("Mang co " +getSophantu()+ " phan tu.");
        System.out.print("IN Mang: ");
        for(int i=0;i<sophantu;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println("\nKich thuoc cua mang: " +getSophantu());
    }
    
    public float trungBinhSoLe(){
        int temp[] = new int[sophantu];
        int count=0, sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                temp[i] = arr[i];
                count++;
                sum += temp[i];
            }
        }
        return ((float)sum/count);
    }
    public int timmax(){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public void hoanvi(int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void ascending(){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                    hoanvi(i, j);
            }
        }
        System.out.print("IN Mang tang dan: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
    }
}
class Demo2{
    public static void main(String[] args) {
        baiTap2 mang = new baiTap2();
        mang.input();
        mang.output();
        System.out.println("Trung binh so le: " + mang.trungBinhSoLe());
        System.out.println("Phan tu lon nhat trong mang: " +mang.timmax());
        mang.ascending();
    }
}
