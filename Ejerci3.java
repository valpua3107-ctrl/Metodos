/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerci3;

import java.util.Scanner;

/**
 * @author [Tiago Amauri Valdiviezo Pua]
 */
public class Ejerci3 {

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre + ".");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String usuario = leer.nextLine();
        
        saludar(usuario);
    }
}