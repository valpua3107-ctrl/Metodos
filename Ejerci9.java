/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci9;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci9 {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la nota 1: ");
        double nota1 = leer.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double nota2 = leer.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double nota3 = leer.nextDouble();

        double promedio = calcularPromedio(nota1, nota2, nota3);
        System.out.println("Promedio del estudiante: " + promedio);

        if (promedio >= 7.0) {
            System.out.println("Estado: Aprobado.");
        } else {
            System.out.println("Estado: Reprobado.");
        }
    }
}