package Sets.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendarContato {
    //atributo
    private Set<Contato>contatoSet;

    public AgendarContato() {
        this.contatoSet = new HashSet<>();
    }
    public void AdicionarContato (String Nome , int Numero){
        contatoSet.add(new Contato(Nome ,Numero));
    }

    public void exibirContatos (){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome (String Nome){
            Set<Contato>contatosPorNome = new HashSet<>();
            for (Contato c : contatoSet){
                if (c.getNome().startsWith(Nome)){
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome ;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null ;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado =c ;
                break;
            }
        }return contatoAtualizado ;
    }

    public static void main(String[] args) {
        AgendarContato agendarContato = new AgendarContato();


        agendarContato.AdicionarContato("Leo",25);
        agendarContato.AdicionarContato("Leonardo",255);
        agendarContato.AdicionarContato("Leonardo Medeiros",2055);
        agendarContato.AdicionarContato("Leo Medeiros",2555);

        agendarContato.exibirContatos();

        System.out.println(agendarContato.pesquisaPorNome("Leonardo"));

        System.out.println("Contato atualizado" + agendarContato.atualizarNumeroContato("Leo",35));

    }
}
