/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci4;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci4 {

    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18) {
            System.out.println("Estado: Es mayor de edad.");
        } else {
            System.out.println("Estado: Es menor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();

        mostrarDatos(nombre, edad);
    }
}