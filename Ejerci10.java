/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci10;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci10 {

    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = leer.nextInt();

        int valorMayor = mayor(num1, num2);
        System.out.println("El numero mayor de los dos ingresados es: " + valorMayor);
    }
}