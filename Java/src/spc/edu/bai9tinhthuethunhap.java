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
public class bai9tinhthuethunhap {
    public static void main(String[] args) {
       System.out.print("tinh thue");
            Scanner sc = new Scanner(System.in);
            double luong, thuong, thunhap;
            System.out.print("nhap luong");
      luong = sc.nextDouble();
      System.out.print("nhap thuong");
     thuong = sc.nextDouble();
      System.out.print("thue thu nhap ");
      thunhap = luong + thuong;
          if (thunhap < 9){
               System.out.println("ko dong thuu ");
    }
 
}
