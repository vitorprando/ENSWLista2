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
public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sexo;
        double altura, peso;
        
        System.out.println("Forneça o sexo (M/F) e a altura em metros (com vírgula): ");
        sexo = sc.next();
        altura = sc.nextDouble();
        
        if (sexo == "M") {
            peso = (72.7 * altura) - 58;
        } else {
            peso = (62.1 * altura) - 44.7;
        }
        
        System.out.println("Peso ideal: " + peso);
        
    }
}
