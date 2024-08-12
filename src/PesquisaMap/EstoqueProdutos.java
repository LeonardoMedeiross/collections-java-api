package PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto>estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto (Long cod , String nome , int quantidade , double preco){
        estoqueProdutosMap.put(cod,new Produto(nome,preco,quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }



    public Produto obterProdutoMaisCaro () {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p ;
                }
            }
        }
        return produtoMaisCaro ;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L,"oleo",3,2.5);
        estoqueProdutos.adicionarProduto(2L,"pao",10,0.5);
        estoqueProdutos.adicionarProduto(3L,"coxinha",5,4.5);

        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total é : "+ estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("o Produto mais caro é : " + estoqueProdutos.obterProdutoMaisCaro());

    }
}
