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
public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
    
    public Coche (){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }
    public String dime_datos_generales(){ //getter
       return "La plataforma del vehículo tiene "  + ruedas + " ruedas" +
               ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
               " cm y un peso de plataforma de " + peso_plataforma + " kg";
    }
    public void establece_color (String color_coche){ //setter
        color=color_coche;
    }
    public String dime_color (){
        return "El color del coche es " + color;
    }
    public void configura_asientos (String asientos_cuero){ //setter
         if (asientos_cuero=="si"){
             this.asientos_cuero=true;
         }else{
             this.asientos_cuero=false;
         }
    }
     public String dime_asientos (){ //getter
         if (asientos_cuero==true){
             return "El coche tiene asientos de cuero";
         }else{
             return "El coche tiene asientos de serie";
         }
     }   
           
    
}
