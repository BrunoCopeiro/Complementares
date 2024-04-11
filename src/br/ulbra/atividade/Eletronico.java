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
public class Eletronico extends Produto {

    private int garantiaMeses;

    public Eletronico() {

    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public Eletronico(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public int calculaGarantiaEstendida() {
        return garantiaMeses + 12;
    }

    public void exibirDetalhes() {

        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preco Unitario: " + getPreUnitario());
        System.out.println("Garantia de Meses: " + getGarantiaMeses());

    }
}
