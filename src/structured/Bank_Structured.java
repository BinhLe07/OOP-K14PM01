package structured;

import java.util.Scanner;

public class Bank_Structured {
    //toan cuc global
    static int account_number = 999;
    static int account_balanced = 0;
    static Scanner input;
    
    //data Emloyee
    static String emName;
    static double salary;

    //data Customer
    static String cusName;
    static String adddress;


    public static void main(String[] args) {
        //data
        //khai bao 2 bien
        //Employee
        //Customer
        //hanh dong thao tac tren data

        input = new Scanner(System.in);

        //show
        show();
        depositAmount();
        withdrawAmount();
    }

    //gui tien
    static void depositAmount(){
        System.out.print("Nhap so tien can gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balanced += depositAmount; // thao tac len data
    }

    //rut tien
    static void withdrawAmount(){
        System.out.print("Nhap so tien can gui: ");
        int withdrawAmount = input.nextInt();
        account_balanced += withdrawAmount; // thao tac len data

    }
    static void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("So tai khoan: "+account_number);
        System.out.println("So du tai khoan: "+account_balanced);  
    }
    
    //emloyee
    static void getEmName(){

        emName = "";

    }
    static void getSalary(){
        salary = 500;
    }

    //customer
    static String getCusInfo(){

        return cusName + adddress;

    }
}
