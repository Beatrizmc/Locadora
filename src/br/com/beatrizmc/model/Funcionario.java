/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.beatrizmc.model;

/**
 *
 * @author guest01
 */
public class Funcionario extends Pessoa{
    private String login;
    private String senha;

    public Funcionario() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "login=" + login + ", senha=" + senha + '}';
    }
}