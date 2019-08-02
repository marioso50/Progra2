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
public class mdJugador {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the punteo
     */
    public int getPunteo() {
        return punteo;
    }

    /**
     * @return the objeto
     */
    public String getObjeto() {
        return objeto;
    }

    /**
     * @param objeto the objeto to set
     */
    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }
    private String nombre;
    private int punteo;
    private String objeto;
    
    public mdJugador(String name){
        nombre = name;
    }
    public void IncrementaPunteo(){
        punteo++;
    }
}
