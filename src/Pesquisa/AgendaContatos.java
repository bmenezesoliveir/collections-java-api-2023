package Pesquisa;


import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibircontato (){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
                System.out.println(c);

            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato  contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
            contatoAtualizado = c;
            break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 119102);
        agendaContatos.adicionarContato("Bruno", 119103);
        agendaContatos.adicionarContato("Caio", 1191023);
        agendaContatos.adicionarContato("Henrique", 119104);

        //agendaContatos.exibircontato();

        agendaContatos.pesquisarPorNome("Camila");


    }

}
