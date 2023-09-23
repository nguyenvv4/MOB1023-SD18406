/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18406.nhanvien;

import java.util.ArrayList;

/**
 *
 * @author nguyenvv
 */
public class Main {

    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        System.out.println("Danh sách nhân viên là: ");
        ArrayList<NhanVien> list = quanLyNhanVien.getListNhanVien();
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien.toString());
        }
    }
}
