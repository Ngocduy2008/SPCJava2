/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class bai15_jframe1 {
    public static void main(String[] args) {
        // tạo 1 JFrame  mới 
        JFrame frame = new JFrame("ví dụ JFrame đơn giản");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);//kích thước của của sổ
        // tạo 1 JFrame
        JPanel panel = new JPanel();
        // tạo 1 nút 
        JButton button = new JButton("nhấn tôi!");
        // thêm nút vào JFrame 
        panel.add(button);
        //thêm JPanel
        // thêm JPanel vào JFrame 
        frame.add(panel);
        // hiển thị cửa sổ 
        frame.setVisible(true);
    }
}
