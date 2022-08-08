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
public class Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        
        System.out.println("Forneça o número: ");
        A = sc.nextInt();
        
        if (A % 2 == 0) {
            A += 5;
        } else {
            A += 8;
        }
        System.out.println(A);
        
    }
}
