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
public class Casada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estadocivil;
        int tempo;
        
        System.out.println("Forneça nome, sexo e estado civil: ");
        nome = sc.next();
        sexo = sc.next();
        estadocivil = sc.next();
        
        if (sexo == "F" && estadocivil == "CASADA") {
            System.out.println("Forneça o tempo de casamento em anos: ");
            tempo = sc.nextInt();
        }
        
    }
}
