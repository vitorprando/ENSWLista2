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
public class Poligono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lados, medida;
        double area;
        
        System.out.println("Escreva o número de lados e a medida do lado em CM: ");
        lados = sc.nextInt();
        medida = sc.nextInt();
        
        if (lados < 3) {
            System.out.println("Não é um polígono.");
        } else if (lados > 5) {
            System.out.println("Polígono não identificado.");
        }
        
        switch (lados) {
            case 3:
            area = (Math.sqrt(3)/4) * (medida*medida);
            System.out.println("Triângulo de área " + area);
            case 4:
            area = medida*medida;   
            System.out.println("Quadrado de área " + area);
            case 5:
            area = 5*medida*(medida/1.453);
            System.out.println("Pentágono de área " + area);
        }
    }
}
