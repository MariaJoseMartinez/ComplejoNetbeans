/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supuesto_3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Supuesto_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);                         
        int num;
        int i;       
        System.out.println("Introducir  número: " );
            num = teclado.nextInt();
                for(i=2;i<=num;i++)  {

                while(num%i==0){
                num=num/i;
                System.out.print(i+" , ");
              
                }
            }
        }
    }             
