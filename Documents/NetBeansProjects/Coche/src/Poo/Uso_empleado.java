/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;
import java.util.*;
/**
 *
 * @author User
 */
public class Uso_empleado {
    public static void main(String[] args) {
        Jefatura jefe_RRHH=new Jefatura ("Juan", 55000,2006,9,25);
        jefe_RRHH.estableceIncentivo(2570);
        Empleado[] misEmpleados=new Empleado[];
        misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1]=new Empleado("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2]=new Empleado("María Martín", 105000, 2002, 03, 15);
        misEmpleados[3]= new Empleado ("Antomio Fernández");
        misEmpleados[4]=jefe_RRHH;//Polimorfismo
        misEmpleados[5]= new Jefatura ("Maria", 95000, 1999, 5, 26);
        Jefatura jefa_Finanzas=(Jefatura)misEmpleados[5];/*convierte un objeto 
        de tipo misEmple en un objeto de tipo Jefatura*/
        jefa_Finanzas.estableceIncentivo(55000);/*para poder llamar a los métodos
        de la clase Jefatura*/
        
        for (Empleado e: misEmpleados){/*Variable e de tipo empleado que 
          se usa para recorrer el array*/
        
        
            e.subeSueldo(5);
        }
        for (Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() +
            " Sueldo: "   + e.dameSueldo() +
            " Fecha de Alta: "  + e.dameFechaContrato()       );
        }
    }    
}
class Empleado{
    public Empleado (String nom, double sue, int agno, int mes, int dia){
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar( agno, mes-1, dia);
        altaContrato=calendario.getTime();
    }
    public Empleado (String nom){
        this(nom, 3000, 2000, 01, 01);
    
    }
    public  String dameNombre(){ //getter
        return nombre;
    } 
    public  double dameSueldo(){ //getter
        return sueldo;
    }
    public  Date dameFechaContrato(){ //getter
        return altaContrato;
    } 
    public void subeSueldo(double porcentaje){ //setter
        double aumento=sueldo*porcentaje;
        sueldo+=aumento;
    }
    private String nombre;
    private double sueldo;
    private Date altaContrato;

}
class Jefatura extends Empleado {

    public Jefatura (String nom, double sue, int agno, int mes, int dia){
        
        super (nom, sue, agno, mes, dia);
        }
    public void estableceIncentivo(double b) {
    
        incentivo=b;
        }
    public double dameSueldo (){
    
        double sueldoJefe=super.dameSueldo();
        return sueldoJefe+incentivo;
    }
    private double incentivo;
}
