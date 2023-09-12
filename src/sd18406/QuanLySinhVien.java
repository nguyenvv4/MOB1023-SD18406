/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18406;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class QuanLySinhVien {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapSinhVien() {
        // b1: Nhap thong tin cua doi tuong
        System.out.println("Nhap ma sinh vien: ");
        String ma = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap lop: ");
        String lop = sc.nextLine();
        System.out.println("Nhap diem: ");
        Integer diem = Integer.parseInt(sc.nextLine());
        // b2: tao ra doi tuong tu thong tin vua nhap
        SinhVien sinhVien = new SinhVien(ma, hoTen, diaChi, tuoi, lop, diem);
        // b3: add doi tuong vao danh sach
        listSinhVien.add(sinhVien);
    }
// cach 1 : dung void

    public void inThongTin() {
        for (SinhVien sinhVien : listSinhVien) {
            System.out.println(sinhVien.toString());
        }
    }

    // cach 2 dung ham co kieu tra ve
    public ArrayList<SinhVien> inThongTin2() {
        return listSinhVien;
    }

}
