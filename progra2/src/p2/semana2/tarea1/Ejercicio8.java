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
public class Ejercicio8 {
   public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }  
}
