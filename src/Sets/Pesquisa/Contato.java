package Sets.Pesquisa;

import java.util.Objects;

public class Contato {
    private String Nome ;
    private int Numero ;

    public Contato(String nome, int numero) {
        Nome = nome;
        Numero = numero;
    }

    public String getNome() {
        return Nome;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    // para diferenciar o contato caso tenha o mesmo nome

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "Nome='" + Nome + '\'' +
                ", Numero=" + Numero +
                '}';
    }
}
