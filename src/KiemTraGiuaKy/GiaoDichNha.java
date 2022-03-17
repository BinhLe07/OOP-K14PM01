package KiemTraGiuaKy;

import java.util.Date;

public class GiaoDichNha extends DanhSachGiaoDich {
    private String loaiNhaCaoCap;
    private String loaiNhaThuong;
    private String diaChi;
    public double thanhTien;

    GiaoDichNha(){

    }

    public GiaoDichNha(double dienTich,String maGiaoDich,double ngayGiaoDich,double donGia,String loaiNhaCaoCap,String loaiNhaThuong,String diaChi,double thanhTien){
        super(maGiaoDich, ngayGiaoDich, donGia,dienTich);
        this.loaiNhaCaoCap = loaiNhaCaoCap;
        this.loaiNhaThuong = loaiNhaThuong;
        this.diaChi = diaChi;
        this.thanhTien = thanhTien;
    }

    @Override
    public void nhap() {
        System.out.println("Loai nha thuong");
        super.nhap();
        thanhTien = super.dienTich * super.donGia;
        System.out.print("Thanh tien(loai nha thuong): "+this.thanhTien);

    }

    @Override
    public String toString() {
        return super.toString()+"Thanh tien: "+thanhTien;
    }

}
