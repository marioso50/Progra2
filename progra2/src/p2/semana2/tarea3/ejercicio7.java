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
public class ejercicio7 {
 public static void main(String[] args) {
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == 8888) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }   
}
