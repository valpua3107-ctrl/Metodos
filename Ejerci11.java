/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci11;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci11 {

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero para evaluar: ");
        int valor = leer.nextInt();

        boolean resultado = esPar(valor);

        if (resultado) {
            System.out.println("El numero " + valor + " es par.");
        } else {
            System.out.println("El numero " + valor + " es impar.");
        }
    }
}