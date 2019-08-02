/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

/**
 *
 * @author mario
 */
public class clsNumerosAleatorios {
   
    
    public int GeneraNumeros(int rango){

       int numero = (int)(Math.random()*rango);
       return numero;
    }
}
