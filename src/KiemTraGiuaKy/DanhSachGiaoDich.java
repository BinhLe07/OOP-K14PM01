package KiemTraGiuaKy;

import java.util.Scanner;

public class DanhSachGiaoDich {
    protected String maGiaoDich;
    protected double ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setNgayGiaoDich(double ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public double getDienTich() {
        return dienTich;
    }


    public DanhSachGiaoDich(){

    }
    public DanhSachGiaoDich(String maGiaoDich,double ngayGiaoDich,double donGia,double dienTich){
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    Scanner input = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ma giao dich: ");
        maGiaoDich = input.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = input.nextDouble();
        System.out.print("Nhap dien tich: ");
        dienTich = input.nextDouble();
        System.out.print("Nhap ngay giao dich:");
        ngayGiaoDich = input.nextDouble();
    }

    @Override
    public String toString() {
        return " Ma giao dich: " + this.maGiaoDich + " / " + " / " + " Don gia: " + this.donGia
        + " / "+"Nhap dien tich: "+this.dienTich+ "/" + " Ngay giao dich: " + this.ngayGiaoDich; 
    }


}
