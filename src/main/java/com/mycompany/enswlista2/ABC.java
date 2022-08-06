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
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        
        System.out.println("Escreva os valores A, B e C: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        if ((A + B) < C) {
            System.out.println("A + B é menor que C");
        } else {
            System.out.println("A + B é MAIOR que C");
        }
        
    }
}
