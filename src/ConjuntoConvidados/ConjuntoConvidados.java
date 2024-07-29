import ConjuntoConvidados.Convidado;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }


    public void adicionarConvidado(String nome, int condigoConvite) {
        convidadoSet.add(new Convidado(nome, condigoConvite));

    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getcodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
    convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados () {
        System.out.println(convidadoSet);


    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1238);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 1239);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
        conjuntoConvidados.removerConvidadoPorCodigo(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}