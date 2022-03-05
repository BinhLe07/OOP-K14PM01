package oo;

import java.util.Scanner;

public class Account {
    //data
    int account_number = 999;
    int account_balanced = 0;

    Scanner input = new Scanner(System.in);

    //fuction
    void depositAmount(){
        System.out.print("Nhap so tien can gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balanced += depositAmount; // thao tac len data
    }

    //rut tien
    void withdrawAmount(){
        System.out.print("Nhap so tien can rut: ");
        int withdrawAmount = input.nextInt();
        account_balanced -= withdrawAmount; // thao tac len data

    }
    void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("So tai khoan: "+account_number);
        System.out.println("So du tai khoan: "+account_balanced);  
    
}
}
