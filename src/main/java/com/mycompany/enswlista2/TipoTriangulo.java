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
public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L1, L2, L3;
        
        System.out.println("Escreva os três lados: ");
        L1 = sc.nextInt();
        L2 = sc.nextInt();
        L3 = sc.nextInt();
        
        if (L1 == L2 && L2 == L3) {
            System.out.println("Equilátero.");
        } else if (L1 == L2 || L2 == L3 || L3 == L1) {
            System.out.println("Isóceles.");
        } else {
            System.out.println("Escaleno.");
        }
    }
}
