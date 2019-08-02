/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso_juego;

/**
 *
 * @author mario
 */
public class clsPiedraPapelTijera {
 
    
    public String obtieneObjeto(int numeroAlAzar){
        
    String objeto="FUERA DE RANGO";
         if (numeroAlAzar==0){
            objeto="piedra";
        }
        
        if(numeroAlAzar==1){
            objeto="papel";
            
        }
        if(numeroAlAzar==2){
            objeto="tijera";
        }
    
       return objeto;
    }
}

