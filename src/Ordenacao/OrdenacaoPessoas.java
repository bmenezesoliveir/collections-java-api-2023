package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura()); {
            return pessoasPorAltura;


        }

    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();

        // Adicionando pessoas
        ordenacaoPessoa.adicionarPessoa("Ana", 30, 1.70);
        ordenacaoPessoa.adicionarPessoa("João", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Maria", 28, 1.65);

        // Ordenando e exibindo por idade
        System.out.println("Ordenado por idade:");
        List<Pessoa> porIdade = ordenacaoPessoa.ordenarPorIdade();
        for (Pessoa p : porIdade) {
            System.out.println(p);
        }

        // Ordenando e exibindo por altura
        System.out.println("\nOrdenado por altura:");
        List<Pessoa> porAltura = ordenacaoPessoa.ordenarPorAltura();
        for (Pessoa p : porAltura) {
            System.out.println(p);
        }
    }
}