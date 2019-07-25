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
public class Ejercicio6 {
     public static void main(String[] args) {

    System.out.println("Área de un triángulo");
    System.out.print("Por favor, introduzca la longitud de la base (cm): ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Inroduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    System.out.println("El área del triángulo es " + (base * altura)/2 + " cm²");
  }
}
