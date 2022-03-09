package Lab4;

import java.util.Scanner;

public class SanPhamBai3TestDrive {
    public static void main(String[] args) {
        SanPhamBai3 sanpham = new SanPhamBai3("San pham 1", 8, 2);

        sanpham.xuat();
        System.out.println("Thue nhap khau: "+sanpham.getThueThuNhap(1));

        SanPhamBai3 sanpham2 = new SanPhamBai3("San pham 2", 20);
        
        sanpham2.xuat();
        System.out.println("Thue nhap khau: "+sanpham2.getThueThuNhap(1));
    }
}
