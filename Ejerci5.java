/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci5;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci5 {

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: No se puede dividir entre cero.");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero real: ");
        double num1 = leer.nextDouble();
        System.out.print("Ingrese el segundo numero real: ");
        double num2 = leer.nextDouble();

        System.out.println("--- Resultados ---");
        operaciones(num1, num2);
    }
}