/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci6;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci6 {

    public static int obtenerNumero() {
        // Math.random() genera un numero decimal entre 0.0 y 0.999...
        // Multiplicado por 100 y sumandole 1 obtenemos un rango de 1 a 100
        int aleatorio = (int) (Math.random() * 100) + 1;
        return aleatorio;
    }

    public static void main(String[] args) {
        int resultado = obtenerNumero();
        System.out.println("Numero aleatorio generado (1-100): " + resultado);
    }
}