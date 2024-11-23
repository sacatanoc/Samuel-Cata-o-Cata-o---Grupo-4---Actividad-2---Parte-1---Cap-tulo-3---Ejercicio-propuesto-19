/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_problema_2;

/**
 *
 * @author Samuel Cataño C
 */
public class Triangulo {
    double lado;
    double perimetro;
    double altura;
    double area;
    
    public Triangulo(double lado) {
        
        this.lado = lado;
        this.perimetro = Math.floor(300*lado+0.5)/100;
        this.altura = Math.floor(100*lado*(Math.sqrt(3)/2)+0.5)/100;
        this.area = Math.floor((100*Math.pow(lado,2)*(Math.sqrt(3)/4))+0.5)/100;
        
    }
}
