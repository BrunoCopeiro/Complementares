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
public class Loja {

    public static void main(String[] args) {
        Eletronico e1 = new Eletronico();
        Livro l1 = new Livro();

        e1.nome = ("Geladeira");
        e1.codigo = (123456);
        e1.precoUnitario = (700);
        l1.nome = ("rolo compressor");
        l1.setAutor = ("Amanda gugel");
        l1.codigo = (123456);
        l1.precoUnitario = (50);

        System.out.println("Nome do Eletronico: " + e1.getNome());
        System.out.println("Codigo: " + e1.getCodigo());
        System.out.println("Preco Unitario: " + e1.getPreUnitario());

        System.out.println("Nome do Autor: " + l1.getAutor());
        System.out.println("Nome do livro: " + l1.getNome());
        System.out.println("Codigo: " + l1.getCodigo());
        System.out.println("Preco Unitario: " + l1.getPreUnitario());
    }

}