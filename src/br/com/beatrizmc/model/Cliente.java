/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

/**
 *
 * @author guest01
 */
public class Cliente {
    private double saldoDisponivel;

    public Cliente() {
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "saldoDisponivel=" + saldoDisponivel + '}';
    }
}

