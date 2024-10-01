package Ordenacao2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastro.adicionarProduto(2L, "Produto 6", 12d, 1);

        // Exibir produtos por nome
        System.out.println("Produtos ordenados por nome:");
        cadastro.exibirProdutosPorNome().forEach(System.out::println);

        // Exibir produtos por preço
        System.out.println("Produtos ordenados por preço:");
        cadastro.exibirProdutosPorPreco().forEach(System.out::println);
    }
}
