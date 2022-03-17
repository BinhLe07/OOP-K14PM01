package oo;

import java.util.Scanner;

public class DanhSachGIaoDich {
    int maGiaoDich;
    int ngayGiaoDich;
    double donGia;
    double soLuong;

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public double getMaGiaoDich() {
        return donGia;
    }

    public void setNgayGiaoDich(int ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public int getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    public double getSoLuong() {
        return soLuong;
    }

    public DanhSachGIaoDich(){

    }
    public DanhSachGIaoDich(int maGiaoDich,int ngayGiaoDich,double donGia,double soLuong){
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    Scanner input = new Scanner(System.in);

    public void nhap(){
        System.out.print("Nhap ma giao dich: ");
        maGiaoDich = input.nextInt();
        System.out.print("Nhap ngay giao dich: ");
        ngayGiaoDich = input.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = input.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = input.nextDouble();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ma giao dich: "+this.maGiaoDich+"/"+"Ngay giao dich: "+this.ngayGiaoDich+"/"+"Don gia: "+this.donGia+"/"+"So luong: "+this.soLuong+"/";
    }

}
