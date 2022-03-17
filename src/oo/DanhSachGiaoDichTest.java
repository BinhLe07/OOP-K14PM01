package oo;

public class DanhSachGiaoDichTest {
    public static void main(String[] args) {
        GiaoDichVang giaodichvang = new GiaoDichVang();
        System.out.println("Giao dich vang");
        giaodichvang.nhap();
        System.out.println(giaodichvang.toString());

        //GiaoDichTien giaodichtien = new GiaoDichTien();
        //System.out.println("Giao dich tien te");
        //giaodichtien.nhap();
        //System.out.println(giaodichtien.toString());
    }
}
