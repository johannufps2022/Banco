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
public class CuentaCorriente extends Cuenta{
    private Double saldoDisponible;
    private Double saldoConable;
    private Double lienaCredito;

    public CuentaCorriente() {
    }

    public CuentaCorriente(Double saldoDisponible, Double saldoConable, Double lienaCredito, Integer numero, Double saldo, Double ahorro) {
        super(numero, saldo, ahorro);
        this.saldoDisponible = saldoDisponible;
        this.saldoConable = saldoConable;
        this.lienaCredito = lienaCredito;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Double getSaldoConable() {
        return saldoConable;
    }

    public void setSaldoConable(Double saldoConable) {
        this.saldoConable = saldoConable;
    }

    public Double getLienaCredito() {
        return lienaCredito;
    }

    public void setLienaCredito(Double lienaCredito) {
        this.lienaCredito = lienaCredito;
    }
    
}
