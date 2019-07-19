/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirquetzaleseuros;

/**
 *
 * @author mario
 */
public class ConvertirQuetzalesEuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double euros = 8.76;
    int quetzales = (int) (euros * 6.00);
    
    System.out.print(euros + " euros son " + quetzales + " quetzales.");
    }
    
}
