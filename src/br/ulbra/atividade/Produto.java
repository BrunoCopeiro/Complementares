/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.atividade;

/**
 *
 * @author aluno.saolucas
 */
public class Produto {

    {

    }
    protected int codigo;
    protected String nome;
    protected double precoUnitario;

    public Produto() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreUnitario() {
        return precoUnitario;
    }

    public void setPreUnitario(double preUnitario) {
        this.precoUnitario = preUnitario;
    }

    public void exibirDetalhes() {

        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("PrecoUnitario: " + precoUnitario);

    }

    public double descontarBlackFriday() {
        double desconto = 0.20 * precoUnitario;
        double precoDesconto = precoUnitario - desconto;
        return precoDesconto;
    }
}
