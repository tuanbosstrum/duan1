/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt;

import java.util.Scanner;
 
public class congtru {
 
    public static void main(String[] args) {
        int aNumber, bNumber;
        char kt;
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Nhập vào số thứ nhất: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        bNumber = scanner.nextInt();
        System.out.println("Nhập phép toán (+, -, *, /): ");
        kt = scanner.next().charAt(0);
         
        switch (kt) {
        case '+':
            System.out.println(aNumber + " + " + bNumber + " = " + (aNumber + bNumber));
            break;
        case '-':
            System.out.println(aNumber + " - " + bNumber + " = " + (aNumber - bNumber));
            break;
        case '*':
            System.out.println(aNumber + " * " + bNumber + " = " + (aNumber * bNumber));
            break;
        case '/':
            if (bNumber == 0) {
                System.out.println("Số bị chia phải khác 0.");
            } else {
                // ép kiểu kết quả về double để có kết quả chính xác
                System.out.println(aNumber + " / " + bNumber + " = " + (float) aNumber / bNumber);
            }
            break;
        default:
            System.out.println("Nhập phép tính không hợp lệ.");
        }
    }
 
}