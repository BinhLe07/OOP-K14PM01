package KiemTraGiuaKy;


public class GiaoDichDat extends DanhSachGiaoDich{
    private String loaiDatA;
    private String loaiDatB;
    private String loaiDatC;
    private double thanhTien;

    GiaoDichDat(){

    }
    public GiaoDichDat(String maGiaoDich,double ngayGiaoDich,double donGia,double dienTich,String loaiDatA,String loaiDatB,String loaiDatC,double thanhTien){
        super(maGiaoDich, ngayGiaoDich, donGia,dienTich);
        this.dienTich = dienTich;
        this.loaiDatA = loaiDatA;
        this.loaiDatB = loaiDatB;
        this.loaiDatC = loaiDatC;
        this.thanhTien = thanhTien;
    }

    @Override
    public void nhap() {
        super.nhap();


    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}
