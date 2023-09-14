/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd18406;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        Scanner sc = new Scanner(System.in);
        String check = "";
        while (true) {
            quanLySinhVien.nhapSinhVien();
            System.out.println("Ban co nhap tiep khong: ");
            // no -> dung lai, nguoc lai -> nhap tiep
            check = sc.nextLine();
            if (check.equals("no")) {
                break;
            }
        }
//        quanLySinhVien.inThongTin();
        ArrayList<SinhVien> list = quanLySinhVien.inThongTin2();
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
//        System.out.println("Nhap ten can tim: ");
//        String tenCanTim = sc.nextLine();
//        ArrayList<SinhVien> ketQua = quanLySinhVien.timKiem(tenCanTim);
//        if (ketQua.isEmpty()) {
//            System.out.println("Khong tim thay");
//        } else {
//            for (SinhVien sinhVien : ketQua) {
//                System.out.println(sinhVien.toString());
//            }
//        }
        String ma = "1";
        SinhVien ketQuaTimTheoMa = quanLySinhVien.timKiemTheoMa(ma);
        if (ketQuaTimTheoMa == null) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Ket qua tim duoc la: \n");
            System.out.println(ketQuaTimTheoMa.toString());
        }
    }
}
