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
public class ABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        
        System.out.println("Escreva os valores A e B: ");
        A = sc.nextInt();
        B = sc.nextInt();
        
        if (A == B) {
            C = A + B;
            System.out.println(C);
        } else {
            C = A * B;
            System.out.println(C);
        }
        
    }
}
