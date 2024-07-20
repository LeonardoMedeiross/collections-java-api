package Sets.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntosConvidado() {
        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidado (String Nome , int CodigoDoConvidado ){
        convidadoSet.add(new Convidado(Nome,CodigoDoConvidado));
    }
    public void removerConvidado (int CodigoDoConvidado){
        Convidado convidadoParaRemover =null ;
        for (Convidado c : convidadoSet){
            if (c.getCodigoDoConvidado()==CodigoDoConvidado);{
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }


    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    
}
