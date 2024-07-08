package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro>livroList ;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>() ;
    }

    public void adicionarLivro (String Titulo , String Autor , int anoPublicado){
        livroList.add(new Livro(Titulo , Autor , anoPublicado));
    }

public List<Livro>pesquisarPorAutor(String Autor){
        List<Livro>livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(Autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
}

    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosProAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro ano : livroList){
                if (ano.getAnoPublicado()>= anoInicial && ano.getAnoPublicado() <= anoFinal){
                    livrosProAnos.add(ano);
                }
            }
        }
        return livrosProAnos ;
    }
    public Livro pesquisarPorTitulo(String Titulo) {
        Livro livroPorTitulo = null ;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(Titulo)){
                    livroPorTitulo= l;
                    break;
                }
            }
        }return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("DR.Toupera", "Crystiane",1999);
        catalogoLivros.adicionarLivro("Sou louca", "Crystiane",1995);
        catalogoLivros.adicionarLivro("Lindo de mais ", "Leonardo",2005);
        catalogoLivros.adicionarLivro("Lindo ", "Leonardo",1998);

        System.out.println(catalogoLivros.pesquisarPorAutor("Crystiane"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1995,1999));
        System.out.println(catalogoLivros.pesquisarPorTitulo("DR.Toupera"));


    }
}
