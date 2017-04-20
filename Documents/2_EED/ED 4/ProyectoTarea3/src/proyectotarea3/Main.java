/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectotarea3;


public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuentaJuan;
        double saldo;

        cuentaJuan = new CuentaBancaria("Juan Pérez","1000-2365-85-1230456789",7200);
        saldo = cuentaJuan.estado();
        System.out.println("El saldo actual es"+ saldo );

        operar(cuentaJuan, null);
    }

    private static void operar(CuentaBancaria cuentaJuan, Float cantidad) {
        try {
            cuentaJuan.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaJuan.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
