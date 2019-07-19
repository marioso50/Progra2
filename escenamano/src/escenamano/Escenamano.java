/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escenamano;

/**
 *
 * @author mario
 */
public class Escenamano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rojo = "\033[31m", verde = "\033[32m", naranja = "\033[33m";
	String azul = "\033[34m", morado = "\033[35m", blanco = "\033[37m";
    
 
		System.out.println(rojo);
		System.out.println("                        ██");
		System.out.println("                        ██");
		System.out.println("                        ██\n" + naranja);
		System.out.println(" " + azul + "              ████████████");
		System.out.println("                     ████████  ██");
		System.out.println("                     ████████████");
		System.out.println("                     ████████");
		System.out.println("░░░░░░░░░░     ████████░░░░░░░░");	
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		
		System.out.println("\033[37m");
    }
    
}
