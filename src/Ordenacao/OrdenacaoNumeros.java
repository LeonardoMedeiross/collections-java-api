package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroList ;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer>numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else {
            throw new RuntimeException("Está vazia ");
        }
    }
    public List<Integer> ordenarDecrecente(){
        List<Integer>numerosAscendente = new ArrayList<>(this.numeroList);
        if(!numeroList.isEmpty()){
            numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
        }else {
            throw new RuntimeException("Está vazia ");
        }
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else {
            System.out.println("Está vazia");
        }
    }




    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(61);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(80);
        ordenacaoNumeros.adicionarNumero(66);
        ordenacaoNumeros.adicionarNumero(43);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        ordenacaoNumeros.exibirNumeros();
        System.out.println(ordenacaoNumeros.ordenarDecrecente());
        ordenacaoNumeros.exibirNumeros();



    }
}
