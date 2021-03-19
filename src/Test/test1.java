/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.HashMap;

/**
 *
 * @author hungh
 */

class STUDENT{
    String masv;
    String name;

    public STUDENT() {}
    public STUDENT(String masv, String name) {
        this.masv = masv;
        this.name = name;
    }

    public String getMasv() {
        return masv;
    }
    public String getName() {
        return name;
    }
    
}

public class test1 {
    public static void main(String[] args) {
        
        HashMap<String, STUDENT> ds = new HashMap<String, STUDENT>();
        
        STUDENT st1 = new STUDENT("234", "sđvvd");
        STUDENT st2 = new STUDENT("645645", "VSDVD");
        ds.put(st1.getMasv(), st1);
//        STUDENT st2 = new STUDENT("645645", "VSDVD");
        ds.put(st2.getMasv(), st2);
        
        String id = "234";
        STUDENT a = ds.get(id);
//        System.out.println(a);
        
        if(a!=null) System.out.println("Name: " +a.getName());
        else{ System.out.println("ID " +a.getMasv()+ " not found!");}
   }
}
