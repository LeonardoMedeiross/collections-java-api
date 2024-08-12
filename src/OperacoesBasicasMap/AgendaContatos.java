package OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendarContatosMap;

    public AgendaContatos(){
        this.agendarContatosMap = new HashMap<>();

    }

    public void adicionarContato(String nome , Integer telefone){
        agendarContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendarContatosMap.isEmpty()){
            agendarContatosMap.remove(nome);
        }
    }
    public void exibirContatos (){
        System.out.println(agendarContatosMap);
    }

    public Integer pesquisarPorNome (String nome){
        Integer numeroPorNome = null;
        if (!agendarContatosMap.isEmpty()){
         numeroPorNome = agendarContatosMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Crystiane",456123789);
        agendaContatos.adicionarContato("Crystianee",456127778);
        agendaContatos.adicionarContato("Leonardo",51987559);
        agendaContatos.adicionarContato("Leo",51987558);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Crystianee");
        agendaContatos.exibirContatos();

        System.out.println("O numero é : "+agendaContatos.pesquisarPorNome("Leonardo"));
    }
}
