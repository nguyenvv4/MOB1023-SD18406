/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18406.nhanvien;

/**
 *
 * @author nguyenvv
 */
public class NhanVien {

    private Integer id;

    private String ten;

    private Integer namSinh;

    private String phongBan;

    public NhanVien(Integer id, String ten, Integer namSinh, String phongBan) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.phongBan = phongBan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ten=" + ten + ", namSinh=" + namSinh + ", phongBan=" + phongBan + '}';
    }
    
    

}
