/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci2;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci2 {

    public static void mostrarPares() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Numeros pares del 2 al 100:");
        mostrarPares();
    }
}