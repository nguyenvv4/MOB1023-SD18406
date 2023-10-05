/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18406.bai8;

/**
 *
 * @author nguyenvv
 */
public class Main {

    public static void main(String[] args) {
        NhanVien1Impl nhanVien1Impl = new NhanVien1Impl();
        nhanVien1Impl.tinhTuoi();
        INhanVien nhanVien = new NhanVien1Impl();
        
        INhanVien nhanVien2 = new NhanVien2Impl();
        
        System.out.println(nhanVien2.tinhTuoi());
        
        System.out.println(nhanVien.tinhTuoi());
        
    }
}
