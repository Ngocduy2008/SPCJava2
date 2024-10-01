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
public class bai21string01 {
    public static void main(String[] args) {
         System.out.println("Bai tap string");
         Scanner sc = new Scanner(System.in);
         System.out.print("NHAP HO VA TEN:");
         String hovaten = sc.nextLine();
         // Tran Phuong Ngoc Duy
           System.out.println("HO: " + hovaten.substring(0, 4));
             System.out.println("Chu Lot: " +  hovaten.substring(5,17));
             System.out.println("Ten: " +  hovaten.substring(17));
          System.out.println("Chu phuong:" +hovaten.substring(5,12));
        
    }
}

