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
public class CuentaAhorros extends Cuenta{
    private Integer numeroGirosMax;
    private Double TasaMensual;
    
    public CuentaAhorros() {
    }
    
    public CuentaAhorros(Integer numeroGirosMax, Double TasaMensual, Integer numero, Double saldo, Double ahorro) {
        super(numero, saldo, ahorro);
        this.numeroGirosMax = numeroGirosMax;
        this.TasaMensual = TasaMensual;
    }

    public Integer getNumeroGirosMax() {
        return numeroGirosMax;
    }

    public void setNumeroGirosMax(Integer numeroGirosMax) {
        this.numeroGirosMax = numeroGirosMax;
    }

    public Double getTasaMensual() {
        return TasaMensual;
    }

    public void setTasaMensual(Double TasaMensual) {
        this.TasaMensual = TasaMensual;
    }

   
    
}
