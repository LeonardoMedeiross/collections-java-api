package List.Pesquisa;

public class Livro {
    private String Titulo ;
    private String Autor ;
    private  int anoPublicado ;

    public Livro(String titulo, String autor, int anoPublicado) {
        Titulo = titulo;
        Autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", anoPublicado=" + anoPublicado +
                '}';
    }
}
