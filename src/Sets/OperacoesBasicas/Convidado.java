package Sets.OperacoesBasicas;

public class Convidado {
    private String Nome ;

    private int CodigoDoConvidado;

    public Convidado(String nome, int codigoDoConvidado) {
        Nome = nome;
        CodigoDoConvidado = codigoDoConvidado;
    }

    public String getNome() {
        return Nome;
    }

    public int getCodigoDoConvidado() {
        return CodigoDoConvidado;
    }

    @Override
    public String  toString() {
        return "Contato{" +
                "Nome='" + Nome + '\'' +
                ", CodigoDoConvidado=" + CodigoDoConvidado +
                '}';
    }
}
