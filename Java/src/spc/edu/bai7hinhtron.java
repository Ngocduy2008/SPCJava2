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
public class bai7hinhtron {
    public static void main(String[] args) {
      double r,cv,dt;
      System.out.println("chuong trinh tinh dien tich va chu vi hinhg tron");
      Scanner sc = new Scanner(System.in);
      System.out.println("nhap ban kinh:");
      r = sc.nextDouble();
      cv = 2*Math.PI*r;
      System.out.println("chu vi="+cv);
      dt = r*r*Math.PI;
      System.out.println("dien tich=" +dt);
    }
}
