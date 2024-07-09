package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
private List<Integer>numeros;

public SomaNumeros(){
    this.numeros = new ArrayList<>();
}

public void adicionarNumero(int numero){
    this.numeros.add(numero);
}
public int calcularSoma(){
    int soma = 0 ;
    for (Integer numero : numeros)
        soma += numero ;
        return soma;

}
public int encontrarMaiorNumero(){
    int maiorNumero = Integer.MIN_VALUE;
    if (!numeros.isEmpty()){
        for (Integer numero : numeros){
            if (numero >= maiorNumero){
                maiorNumero = numero ;
            }
        }return maiorNumero ;
    }else {
        throw new RuntimeException("A Lista está vazia");
    }
}
public int encontrarMenorNumero(){
    int menorNumero = Integer.MAX_VALUE;
    if (!numeros.isEmpty()){
        for (Integer numero : numeros){
            if (numero <= menorNumero){
                menorNumero = numero;
            }
        }return menorNumero ;
    }else {
        throw new RuntimeException("A Lista está vazia");
    }
}

public void exibirNumeros(){
    if (!numeros.isEmpty()){
        System.out.println(this.numeros);
    }else {
        System.out.println("A Lista está vazia");
    }
}

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

       somaNumeros.adicionarNumero(3);
       somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);



        System.out.println("Os numeros são : ");
        somaNumeros.exibirNumeros();

        System.out.println("A Soma dos numeros é : " + somaNumeros.calcularSoma());
        System.out.println("O Menor numero é : " + somaNumeros.encontrarMenorNumero());
        System.out.println("O Maior numero é : " + somaNumeros.encontrarMaiorNumero());


    }




}

