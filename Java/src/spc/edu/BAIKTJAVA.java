/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BAIKTJAVA {
    public static void main(String[] args) {
         System.out.println("tinh chu vi dien tich hinh tam giac");
        Scanner sc = new Scanner(System.in);
        double canha,canhb,canhc,nuachuvi,chuvi,dientich;
        System.out.print("nhap canha:");
        canha = sc.nextInt();
         System.out.print("nhap canhb:");
          canhb = sc.nextInt();
          System.out.print("nhap canhc:");
          canhc = sc.nextInt();
          nuachuvi = (canha + canhb + canhc) / 2; 
         dientich = Math.sqrt(nuachuvi * (nuachuvi -canha) * (nuachuvi - canhb) * (nuachuvi - canhc));
         chuvi = (canha + canhb + canhc);
        
          System.out.println("chu vi = " + chuvi);
           System.out.println("dien tich = " + dientich);
    }
}
