/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enswlista2;
import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class DobroTriplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        
        System.out.println("Forneça o número: ");
        A = sc.nextInt();
        
        if (A < 0) {
            System.out.println(A*3);
        } else {
            System.out.println(A*2);
        }
        
    }
}
