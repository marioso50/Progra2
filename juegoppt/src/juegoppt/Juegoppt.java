/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoppt;

import numeros.clsNumerosAleatorios;
import proceso_juego.clsPiedraPapelTijera;
import proceso_juego.mdJugador;

/**
 *
 * @author mario
 */
public class Juegoppt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//                 for (int i = 1; i <= 20; i++){ 
//             System.out.println(num.GeneraNumeros(2)
//         }
        clsNumerosAleatorios num = new clsNumerosAleatorios();
        
        
//         for (int i = 1; i <= 20; i++){ 
     clsPiedraPapelTijera juego = new clsPiedraPapelTijera();
//     String Player1="";
//     String Player2="";
         mdJugador Player = new mdJugador("Mario");
         mdJugador Player2 = new mdJugador("juan");
     int numero;
     numero = num.GeneraNumeros(3);
     String objeto = juego.obtieneObjeto(0);
     Player.setObjeto(objeto);
     numero = num.GeneraNumeros(3);
     objeto = juego.obtieneObjeto(1);
     Player2.setObjeto(objeto);
//             Player1=juego.obtieneObjeto(numero);
//             numero = num.GeneraNumeros(3);
//             Player2=juego.obtieneObjeto(numero);
//             
//            System.out.println("Jugador 1="+Player1+"  jugador2="+Player2);
    
       
          Player2.IncrementaPunteo();
       Player2.IncrementaPunteo();
    
    Player.IncrementaPunteo();
       Player.IncrementaPunteo();
          Player.IncrementaPunteo();
             Player.IncrementaPunteo();
             
             System.out.println(Player.getNombre()+" SU objeto ES  = "+Player.getObjeto());
             System.out.println(Player2.getNombre()+" SU objeto ES  = "+Player2.getObjeto());
             
             if(Player.getObjeto().equals("piedra")&&Player2.getObjeto().equals("papel")){
                 Player2.IncrementaPunteo();
             }
             System.out.println(Player.getNombre()+" SU punteo ES  = "+Player.getPunteo());
             System.out.println(Player2.getNombre()+" SU punteo ES  = "+Player2.getPunteo());
    
    
    }
}

