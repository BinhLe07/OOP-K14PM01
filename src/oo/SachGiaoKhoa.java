package oo;

public class SachGiaoKhoa extends ThuVien {
    private boolean tinhTrang;

    public SachGiaoKhoa(){
        
    }
    public SachGiaoKhoa(String maSach,String ngayNhap,double donGia,int soLuong,String nhaXuatBan,boolean tinhTrang){
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }


    
    public double tinhTienTheoTinhTrang(boolean tinhTrang){
        if( tinhTrang == true){
            return super.soLuong * super.donGia;
        }
        else{
            return super.soLuong * super.donGia * 0.5;
        }
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Tinh trang sach: ");
        tinhTrang = input.nextBoolean();
    }
    @Override
        public String toString() 
        {
            return super.toString() + " / " + " Tinh Trang Sach ( Tru/False ): "+ this.tinhTrang +
             " / " + " Thanh Tien: " + this.tinhTienTheoTinhTrang(tinhTrang);
        }

}
