/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd18406.java1;

import java.util.Scanner;

/**
 *
 * @author nguyenvv
 */
public class ngoaile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer x = 0;
        System.out.println("Nhap x: ");
        try {
            x = Integer.parseInt(sc.nextLine());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("X la : " + x);
    }
}
