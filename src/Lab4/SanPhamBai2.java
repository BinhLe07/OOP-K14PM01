package Lab4;

import java.util.Scanner;

public class SanPhamBai2 {
    String tenSP;
    double donGia;

    Scanner input = new Scanner(System.in);

    void nhap(){
        System.out.print("Ten san pham: ");
        tenSP = input.nextLine();
        System.out.print("Gia ban: ");
        donGia = input.nextDouble();
    }
    void xuat(){
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Gia ban: "+donGia);
    }
}
