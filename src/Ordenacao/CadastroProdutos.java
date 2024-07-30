package Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;


    public class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        TreeSet<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }



    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos
        cadastroProdutos.adicionarProduto("Régua", 123654, 3.50, 10);
        cadastroProdutos.adicionarProduto("Lápis", 789012, 1.20, 50);
        cadastroProdutos.adicionarProduto("Caderno", 345678, 12.00, 20);

        // Exibindo produtos por nome
        System.out.println("Produtos por nome:");
        for (Produto p : cadastroProdutos.exibirProdutosPorNome()) {
            System.out.println(p);
        }

        // Exibindo produtos por preço
        System.out.println("\nProdutos por preço:");
        for (Produto p : cadastroProdutos.exibirProdutosPorPreco()) {
            System.out.println(p);
        }
    }


}
