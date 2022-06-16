/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class Cliente {
  private String nombre;
  private String Apellido;
  private String rut;  
  private ArrayList<Cuenta>cuentas = new ArrayList();
    
    
    public Cliente(String nombre, String Apellido, String rut) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.rut = rut;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
  
     public void agregarCuenta(Cuenta cuenta){
     
         cuentas.add(cuenta);
         System.out.println("se añadio cuenta");   
     }
     
     public void mostrarcuentas(){
     for(int i=0;i<cuentas.size();i++)
         System.out.println(" Cliente "+cuentas.get(i).toString());
     
     }
      public void mostrarsaldo(){
     for(int i=0;i<cuentas.size();i++)
         System.out.println("  Cliente  "+nombre+" cuenta "+cuentas.get(i).getNumero()+"  saldo "+cuentas.get(i).getSaldo());
     }
}