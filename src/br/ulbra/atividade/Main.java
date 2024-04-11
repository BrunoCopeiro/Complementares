/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.atividade;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Eletronico e1 = new Eletronico();
        Livro l1 = new Livro();
        Produto p1 = new Produto();
        Loja lo1 = new Loja();

        System.out.println("Digite o nome do produto:");
        p1.setNome(ler.nextLine());
        System.out.println("Desconto");
    }

}