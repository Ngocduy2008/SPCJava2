/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class Bai23_hinhhoc {
    public static void main(String[] args) {
        HinhHoc h;
        h = new HinhChuNhat(4,5);
        System.out.println("chu vi = " + h.tinhchuvi());
        System.out.println("Dien tich = " + h.tinhdientich());
        System.out.println("--------------");
        h = new HinhVuong(5);
        System.out.println("chu vi = " + h.tinhchuvi());
        System.out.println("Dien tich = " + h.tinhdientich());
        HinhChuNhat hcn = new HinhVuong(5);
        System.out.println("--------------");
        System.out.println("chu vi = " + hcn.tinhchuvi());
        System.out.println("Dien tich = " + hcn.tinhdientich());
    }
}
