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
public class QuanLyNhanVien {
    ArrayList<NhanVien> list = new ArrayList<>();
    
    ArrayList<NhanVien> getListNhanVien(){
        list.add(new NhanVien(1, "Nguyen Van A", 1999, "Ke toan"));
        list.add(new NhanVien(2, "Nguyen Van B", 2000, "Nhan su"));
        return list;
    }
}
