package oo;

public class GiaoDichVang extends DanhSachGIaoDich{

    public String loaiVang;
    public double thanhTien;

    GiaoDichVang(){

    }
    GiaoDichVang(int maGiaoDich, int ngayGiaoDich,double donGia,double soLuong,double thanhTien,String loaiVang){
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
        this.thanhTien = thanhTien;
    }



    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        System.out.print("Loai vang: ");
        System.out.println();
        loaiVang = input.nextLine();
        super.nhap();
        thanhTien = super.soLuong * super.donGia;
        System.out.println("Thanh tien: "+this.thanhTien);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"Thanh tien: "+thanhTien;
    }
}
