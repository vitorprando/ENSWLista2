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
public class Aproveitamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double id, nota1, nota2, nota3, ME, MA;
        String conceito;
        
        System.out.println("Forneça o número de ID e as três notas: ");
        id = sc.nextDouble();
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        conceito = "?";
        boolean apv = true;
        
        ME = (nota1 + nota2 + nota3)/3;
        
        MA = ((nota1+nota2)*2 + (nota3*3) + ME)/7;
        
        if (MA >= 90) {
            conceito = "A";
        } else if (MA >= 75 && MA < 90) {
            conceito = "B";
        } else if (MA >= 60 && MA < 75) {
            conceito = "C";
        } else if (MA >= 40 && MA < 60) {
            conceito = "D";
            apv = false;
        } else if (MA < 40) {
            conceito = "E";
            apv = false;
        }
        
        System.out.println("ID "+ id);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média das notas: " + ME);
        System.out.println("Média de aproveitamento: " + MA);
        System.out.println("Conceito: " + conceito);
        if (apv = true) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
