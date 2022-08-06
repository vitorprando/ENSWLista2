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
public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta, raizum, raizdois;
        
        System.out.println("Forneça os valores a, b e c da equação de segundo grau: ");
        a = sc.nextDouble();
        if (a == 0) {
           System.out.println("a não pode ser zero."); 
        } else {
            
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        delta = (b*b) - (4*a*c);
        
        if (delta < 0) {
           System.out.println("Não há raízes reais."); 
        } else {
            
        raizum = ((-b) + Math.sqrt(delta))/2*a;
        raizdois = ((-b) - Math.sqrt(delta))/2*a; 
        
        System.out.println("Raízes: " + raizum + ", " + raizdois);
        
        } 
        }
        
    }
}
