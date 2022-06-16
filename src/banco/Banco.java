/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Cliente c1=new Cliente("juan","manuel", "15204");
    Cliente c2=new Cliente("manuel","juan","154001");
    Cliente c3=new Cliente("hernando","andres" ,"155115"); 
    Cliente c4=new Cliente("fabian","manuel","15401");
    CuentaAhorros ca1=new CuentaAhorros(1500000,150000.0,1200000,150000.0,150000.0);
     CuentaAhorros ca2=new CuentaAhorros(1500000,150000.0,1200000,150000.0,150000.0);
      CuentaAhorros ca3=new CuentaAhorros(1500000,150000.0,1200000,150000.0,150000.0);
       CuentaAhorros ca4=new CuentaAhorros(1500000,150000.0,1200000,150000.0,150000.0);
        CuentaCorriente cC1=new CuentaCorriente(15000000.0, 1540000.0,15400.0,1584,154848.0,15489.0);
        CuentaCorriente cC2=new CuentaCorriente(15000000.0, 1540000.0,15400.0,1584,154848.0,15489.0);
        CuentaCorriente cC3=new CuentaCorriente(15000000.0, 1540000.0,15400.0,1584,154848.0,15489.0);
        CuentaCorriente cC4=new CuentaCorriente(15000000.0, 1540000.0,15400.0,1584,154848.0,15489.0);
   
    c1.agregarCuenta(ca3);
    c1.agregarCuenta(cC2);
    c2.agregarCuenta(ca2);
    c2.agregarCuenta(cC3);
    c3.agregarCuenta(cC4);
    c3.agregarCuenta(cC1);
    c1.mostrarcuentas();
    c2.mostrarcuentas();
    c3.mostrarcuentas();
    c3.mostrarsaldo();
    c2.mostrarsaldo();
    c1.mostrarsaldo();
    }
    
}
