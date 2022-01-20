package BaiTapVeNha.BaiTapXoayHinh;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int chonChucNang;
        System.out.println("Menu");
        System.out.println("1.Xoay hinh tam giac");
        System.out.println("2.Xoay hinh chu nhat");
        System.out.println("Lua chon 1 hoac 2:  ");
        chonChucNang = input.nextInt();

        if( chonChucNang == 1)
        {
            HinhTamGiac hinhTamGiac = new HinhTamGiac();
            hinhTamGiac.xoayHinhTamGiac();
            hinhTamGiac.phatAmThanhHinhTamGiac();
        }

        if( chonChucNang == 2)
        {
            HinhChuNhat hinhChuNhat = new HinhChuNhat();
            hinhChuNhat.xoayHinhChuNhat();
            hinhChuNhat.phatAmThanhNhacHinhChuNhat();
        }

    
    }    
}