package oo;

import java.util.Scanner;

public class ThuVien {
    private String maSach;
    private String ngayNhap;
    protected double donGia;
    protected int soLuong;
    private String nhaXuatBan;
    

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getMaSach() {
        return maSach;
    }
    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public String getNgayNhap() {
        return ngayNhap;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public ThuVien(){

    }

    public ThuVien(String maSach,String ngayNhap,double donGia,int soLuong,String nhaXuatBan){
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

     Scanner input = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ma sach: ");
        this.maSach = input.nextLine();
        System.out.print("Nhap ngay nhap: ");
        this.ngayNhap = input.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = input.nextDouble();
        System.out.println("Nhap so luong: ");
        this.soLuong = input.nextInt();
        System.out.println("Nhap nha xuat ban: ");
        this.nhaXuatBan = input.nextLine();
        input.nextLine();
    }
    public String toString() 
    {
        return " Ma sach: " + this.maSach + " / " + " Nha xuat ban: " +this.nhaXuatBan + "/ " + " So luong: " + this.soLuong +
         " / " + " Don gia: " + this.donGia + " / " + " Ngay nhap: " + this.ngayNhap; 
    }




}
