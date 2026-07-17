/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci8;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci8 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        double b = leer.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double h = leer.nextDouble();

        double area = calcularArea(b, h);
        System.out.println("El area calculada del rectangulo es: " + area);
    }
}