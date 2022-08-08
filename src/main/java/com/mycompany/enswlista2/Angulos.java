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
public class Angulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2, a3;
        
        System.out.println("Escreva os três ângulos: ");
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        
        if (a1 == 90 || a2 == 90 || a3 == 90) {
            System.out.println("Triângulo retângulo.");
        } else if (a1 > 90 || a2 > 90 || a3 > 90) {
            System.out.println("Triângulo obtusângulo.");
        } else {
            System.out.println("Triângulo acutângulo.");
        }
    }
}
