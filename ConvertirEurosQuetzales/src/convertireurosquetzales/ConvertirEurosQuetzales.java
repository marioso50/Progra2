/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertireurosquetzales;

/**
 *
 * @author mario
 */
public class ConvertirEurosQuetzales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double euros = 6.00;
    int quetzales = (int) (euros * 8.76);
    
    System.out.print(euros + " euros son " + quetzales + " quetzales.");
    }
    
}
