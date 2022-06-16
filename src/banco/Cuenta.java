/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;



/**
 *
 * @author estudiante
 */
public class Cuenta {
    private Integer numero;
    private Double saldo;
    private Double ahorro;

    public Cuenta() {
    }

    public Cuenta(Integer numero, Double saldo, Double ahorro) {
        this.numero = numero;
        this.saldo = saldo;
        this.ahorro = ahorro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getAhorro() {
        return ahorro;
    }

    public void setAhorro(Double ahorro) {
        this.ahorro = ahorro;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + ", ahorro=" + ahorro + '}';
    }
  
        
        }            

