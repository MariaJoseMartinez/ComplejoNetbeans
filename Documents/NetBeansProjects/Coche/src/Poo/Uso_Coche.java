/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

/**
 *
 * @author User
 */
public class Uso_Coche {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Coche micoche=new Coche ();
        micoche.establece_color("marrón");
        
        
        micoche.configura_asientos("si");
        System.out.println(micoche.dime_asientos());
    }
    
}
