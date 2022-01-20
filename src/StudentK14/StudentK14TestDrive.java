package StudentK14;

import java.util.Scanner;

public class StudentK14TestDrive {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        StudentK14 studentK14 = new StudentK14();
        
        int cs = 5;
        while(cs != 2 )
        {
            studentK14.nhapThongTinStudent();      
            studentK14.show();
            System.out.println("1. Nhap Lai Thong Tin ");
            System.out.println("2. Thoat Ra");
            cs = input.nextInt();
            System.out.println("-----------------------------------------");
        }

    }    
}