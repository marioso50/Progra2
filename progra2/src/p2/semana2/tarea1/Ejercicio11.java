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
public class Ejercicio11 {
    public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de Kb: ");
    double kb = Double.parseDouble(System.console().readLine());
    System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb.");
  }
}
