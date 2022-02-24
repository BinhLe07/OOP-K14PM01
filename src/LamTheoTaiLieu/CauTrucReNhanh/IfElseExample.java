package LamTheoTaiLieu.CauTrucReNhanh;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double score;
        System.out.println("Nhap diem: ");
        score = input.nextDouble();

        if(score < 4.0)//
            System.out.println("Xin loi, ban da rot khoa hoc. ");
        else
            System.out.println("Xin chuc mung, ban da vuot qua khoa hoc. ");
    }
}
