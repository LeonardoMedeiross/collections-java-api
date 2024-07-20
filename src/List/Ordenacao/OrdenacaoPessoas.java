package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList ;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa>pessoasPorIdade  = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa>ordenarPorAltura (){
        List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Leo", 28,1.80);
        ordenacaoPessoas.adicionarPessoa("Gustavo", 22,1.65);
        ordenacaoPessoas.adicionarPessoa("Crystiane", 29,1.55);
        ordenacaoPessoas.adicionarPessoa("Crystian", 30,1.79);


        System.out.println("A oredem por idade é : "+ ordenacaoPessoas.ordenarPorIdade());
        System.out.println("A oredem por Altura é : "+ ordenacaoPessoas.ordenarPorAltura());

    }
}


