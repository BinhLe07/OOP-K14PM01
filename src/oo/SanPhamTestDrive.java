package oo;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sanpham = new SanPham("San pham 1", 8, 2);

        //sanpham.nhap();
        sanpham.xuat();
        System.out.println("Thue nhap khau: "+sanpham.getThueThuNhap(1));

        SanPham sanpham2 = new SanPham("San pham 2", 20);
        //sanpham2.nhap();
        sanpham2.xuat();
        System.out.println("Thue nhap khau: "+sanpham2.getThueThuNhap(1));
    }
}
