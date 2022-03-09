package Lab4;

public class SanPhamBai1TestDrive {
    public static void main(String[] args) {
        SanPhamBai1 sanpham = new SanPhamBai1();

        sanpham.nhap();
        sanpham.xuat();
        System.out.println("Thue nhap khau la: "+sanpham.getThueThuNhap(10));
    }
}
