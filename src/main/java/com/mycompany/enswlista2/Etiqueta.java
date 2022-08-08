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
public class Etiqueta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        double valor, valor2;
        
        System.out.println("Forneça o valor do produto e então o código da condição de pagamento (de 1 a 4): ");
        valor = sc.nextDouble();
        codigo = sc.nextInt();
        
        switch (codigo) {
            case 1:
                valor = valor * 0.9;
                System.out.println(valor);
            case 2:
                valor = valor * 0.85;
                System.out.println(valor);
            case 3:
                System.out.println(valor + " em 2 vezes sem juros.");
            case 4:
                valor = valor/2;
                valor2 = valor*1.1;
                System.out.println(valor + " + " + valor2);
        }
    }
}
