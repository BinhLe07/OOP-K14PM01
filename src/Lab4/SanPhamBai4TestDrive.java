package Lab4;

public class SanPhamBai4TestDrive {
    public static void main(String[] args) {
        SanPhamBai4 sanpham = new SanPhamBai4();

        sanpham.setTenSP("Laptop");
        System.out.println("Ten san pham: "+sanpham.getTenSP());

        sanpham.setDonGia(100);
        System.out.println("Don gia: "+sanpham.getDonGia());

        sanpham.setGiamGia(20);
        System.out.println("Giam gia: "+sanpham.getGiamGia());
    }
}
