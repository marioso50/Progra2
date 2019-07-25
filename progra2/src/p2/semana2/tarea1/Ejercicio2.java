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
public class Ejercicio2 {
     public static void main(String[] args) {

    System.out.print("Por favor, introduce la cantidad de euros que quieres convertir: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas + " pesetas.");
  }
    
}
