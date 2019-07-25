/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2.semana2.tarea1;

/**
 *
 * @author mario
 */
public class Ejercicio5 {
    public static void main(String[] args) {

    System.out.println("Área de un rectángulo");
    System.out.print("Por favor, introduzca la longitud de la base (cm): ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del rectángulo es " + (base * altura) + " cm²");
  }
    
}
