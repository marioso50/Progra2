/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2.semana2.tarea3;

/**
 *
 * @author mario
 */
public class ejercicio15 {
     public static void main(String[] args) {
     
    System.out.print("Introduzca un número real como base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

  }
}
