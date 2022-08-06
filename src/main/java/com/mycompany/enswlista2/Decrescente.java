/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enswlista2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author labinfo
 */
public class Decrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] A = {0, 0, 0};
        
        System.out.println("Forneça os três números: ");
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        
        Arrays.sort(A, Collections.reverseOrder());
        System.out.printf(Arrays.toString(A));
    }
}
