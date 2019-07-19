/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariodeclasescolores;

/**
 *
 * @author mario
 */
public class HorariodeclasesColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";
 
		
                System.out.println("Lunes      \tMartes     \tMiércoles      \tJueves.    \tViernes");
	System.out.println("======     \t=======    \t======         \t======     \t======");
	System.out.println(verde + "Matematica" + rojo + "\tProgramacion" + celeste + "\tMicroeconomia" + morado + "  \tEstadistica" + blanco + "\tCalculo");
        System.out.println(verde +"Matematica"+ rojo + "\tProgramacion" + celeste + "\tMicroeconomia " + morado + " \tEstadistica" + blanco + "\tCalculo");
        System.out.println(verde +"Matematica"+ rojo + "\tProgramacion" + verde + "\tMatematica" + morado + "  \tEstadistica" + blanco + "\tCalculo");
        System.out.println(verde +"Matematica"+ rojo + "\tProgramacion" + celeste + "\tMicroeconomia" + morado + "  \tEstadistica" + blanco + "\tCalculo");
        System.out.println(verde +"Matematica"+ rojo + "\tProgramacion" + celeste + "\tMicroeconomia" + verde + "  \tMatematica" + blanco + "\tCalculo");
        
    }
    
}
