package BaiTapVeNha.BaiTapSV;

import java.util.Scanner;

public class StudentK14 {
    Scanner input = new Scanner(System.in);
    String name_Student;
    int mssv;
    int old_Student;
    String address_Student;

    StudentK14()
    {

    }

    StudentK14(String n, int ms, int o, String ad)
    {
        name_Student = n;
        mssv = ms;
        old_Student = o;
        address_Student = ad;

    }

    void nhapThongTinStudent()
    {
        System.out.println("Nhap ho va ten: ");
        name_Student = input.nextLine();
        System.out.println("Nhap MSSV: ");
        mssv = input.nextInt();
        System.out.println("Nhap tuoi: ");
        old_Student = input.nextInt();
        input.nextLine();
        System.out.println("Nhap que quan: ");
        address_Student = input.nextLine();
    }

    void show()
    {
        System.out.println("--------------------------------");
        System.out.println("Ten: "+ name_Student);
        System.out.println("MSSV: "+ mssv);
        System.out.println("Tuoi: "+ old_Student);
        System.out.println("Que Quan: "+ address_Student);
    }

}
