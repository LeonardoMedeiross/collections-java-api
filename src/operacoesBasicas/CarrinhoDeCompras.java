package operaçoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem ;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco , int quantidade){
        listaItem.add(new Item(nome , preco ,quantidade));
    }
    public void removerItem (String nome){
        List<Item> removerItens = new ArrayList<>();
        if (!listaItem.isEmpty()){
            for (Item i : listaItem){
                if (i.getNome().equalsIgnoreCase(nome)){
                    removerItens.add(i);
                }
            }
            listaItem.removeAll(removerItens);
        }else {
            System.out.println("A lista ta vazia");
        }
    }
    public double calularValorTotal() {
        double valorTotal =0d;
        if (!listaItem.isEmpty()) {
            for (Item item : listaItem) {
                double valorItem = item.getPreco() + item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void exibirItens(){
        if (!listaItem.isEmpty()){
            System.out.println(listaItem);
        }else {
            System.out.println("Lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItem=" + listaItem +
                '}';
    }

    public static void main(String[] args) {
       //criando a instacia do carrinho
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionando os itens
        carrinhoDeCompras.adicionarItem("Lapis",2d,3);
        carrinhoDeCompras.adicionarItem("Lapis",2d ,3);
        carrinhoDeCompras.adicionarItem("Caneta",1d ,6);
        carrinhoDeCompras.adicionarItem("Caderno",35d ,6);


        //exibindo itens
        carrinhoDeCompras.exibirItens();

        //removendo
        carrinhoDeCompras.removerItem("lapis");

        //exibindo os itens sem duplicação
        carrinhoDeCompras.exibirItens();

        //exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calularValorTotal());

    }
}