/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resultados;

/**
 *
 * @author Graciela
 */
public class Resultados {

     public static void main(String[] args) {
        // Declarar las variables
        int M = 6;
        int T = 1;
        int K = -10;

        // Evaluar las expresiones
        boolean resultado1 = M > T;
        boolean resultado2 = (T / K == -5);
        boolean resultado3 = (M + T == 7) || (M - T == 5);

        // Imprimir los resultados
        System.out.println("M > T: " + resultado1);        
        System.out.println("T / K == -5: " + resultado2);  
        System.out.println("(M + T == 7) || (M - T == 5): " + resultado3); 
    }
}
