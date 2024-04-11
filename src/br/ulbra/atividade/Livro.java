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
public class Livro extends Produto {

    private String autor;
    String setAutor;

    public Livro() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirAutor() {
        System.out.println("Nome do autor: " + autor);
    }

    public void exibirDetalhes() {

        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preco Unitario: " + getPreUnitario());
        System.out.println("Nome do autor: " + getAutor());
    }
}
