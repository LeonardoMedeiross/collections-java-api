package Sets.Odenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto>produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
            produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto>exibirProdutosPorNome (){
        //usando o treeSet para deixar organizado
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome ;

    }
    public Set<Produto>exibirPorPreco(){
        Set<Produto> preco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return preco ;
    }
}
