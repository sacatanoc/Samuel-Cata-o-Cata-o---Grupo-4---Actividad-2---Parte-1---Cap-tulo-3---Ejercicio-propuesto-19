/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_2;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_3_Ejercicio_propuesto_numero_19 {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Por favor ingrese la longitud del lado del triángulo equilátero:");
        double lado = lector.nextDouble();
        
        Triangulo triangulo_1 = new Triangulo(lado);
        
        System.out.println("Perímetro: "+triangulo_1.perimetro);
        System.out.println("Altura: "+triangulo_1.altura);
        System.out.println("Área: "+triangulo_1.area);
        
    }
}
