/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author huyduy
 */
public class PhieuSuaChua1 {
    private int idPhieuSuaChua;
    private String nhanVienPhucVu;
    private Date ngayNhan;
    private String tenKhachHang;
    private String bienKiemSoat;
    private String dienThoai;
    private Date ngayGiao;
    private String nhanVienSuaChua;
    private String tinhTrangTruoc;
    private Date ngayTra;
    private int tongPhi;
    private String tinhTrangSau;

    public PhieuSuaChua1(){}
    
    public PhieuSuaChua1(int idPhieuSuaChua, String nhanVienPhucVu, Date ngayNhan, String tenKhachHang, String bienKiemSoat, String dienThoai, Date ngayGiao, String nhanVienSuaChua, String tinhTrangTruoc, Date ngayTra, int tongPhi, String tinhTrangSau) {
        this.idPhieuSuaChua = idPhieuSuaChua;
        this.nhanVienPhucVu = nhanVienPhucVu;
        this.ngayNhan = ngayNhan;
        this.tenKhachHang = tenKhachHang;
        this.bienKiemSoat = bienKiemSoat;
        this.dienThoai = dienThoai;
        this.ngayGiao = ngayGiao;
        this.nhanVienSuaChua = nhanVienSuaChua;
        this.tinhTrangTruoc = tinhTrangTruoc;
        this.ngayTra = ngayTra;
        this.tongPhi = tongPhi;
        this.tinhTrangSau = tinhTrangSau;
    }

    public int getIdPhieuSuaChua() {
        return idPhieuSuaChua;
    }

    public void setIdPhieuSuaChua(int idPhieuSuaChua) {
        this.idPhieuSuaChua = idPhieuSuaChua;
    }

    public String getNhanVienPhucVu() {
        return nhanVienPhucVu;
    }

    public void setNhanVienPhucVu(String nhanVienPhucVu) {
        this.nhanVienPhucVu = nhanVienPhucVu;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public Date getNgayGiao() {
        return ngayGiao;
    }

    public void setNgayGiao(Date ngayGiao) {
        this.ngayGiao = ngayGiao;
    }

    public String getNhanVienSuaChua() {
        return nhanVienSuaChua;
    }

    public void setNhanVienSuaChua(String nhanVienSuaChua) {
        this.nhanVienSuaChua = nhanVienSuaChua;
    }

    public String getTinhTrangTruoc() {
        return tinhTrangTruoc;
    }

    public void setTinhTrangTruoc(String tinhTrangTruoc) {
        this.tinhTrangTruoc = tinhTrangTruoc;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getTongPhi() {
        return tongPhi;
    }

    public void setTongPhi(int tongPhi) {
        this.tongPhi = tongPhi;
    }

    public String getTinhTrangSau() {
        return tinhTrangSau;
    }

    public void setTinhTrangSau(String tinhTrangSau) {
        this.tinhTrangSau = tinhTrangSau;
    }
    
    
            
             
}
