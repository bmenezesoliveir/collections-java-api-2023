import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //atributo
    private List<Livro> livroLista;

    public CatalogoLivro() {
        this.livroLista = new ArrayList<>();
    }

    public void obterNumeroTotalLivros() {
        int total = livroLista.size();
        System.out.println(total);
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
           }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquuisaPorIntervaloAnos(int anoInicial, int anofinal){
        List<Livro> livrosporIntervaloAnos = new ArrayList<>();
        if(!livrosporIntervaloAnos.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anofinal){
                    livrosporIntervaloAnos.add(l);
                }
            }
        }
        return livrosporIntervaloAnos;
    }

    public Livro pesquisarPorTiulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivro catalogoLivros = new CatalogoLivro();

        catalogoLivros.adicionarLivro("livro 1", "1", 1990);
        catalogoLivros.adicionarLivro("livro 1", "2", 1991);
        catalogoLivros.adicionarLivro("livro 2", "2", 1992);
        catalogoLivros.adicionarLivro("livro 4", "3", 2020);
        catalogoLivros.adicionarLivro("livro 5", "4", 1994);




        System.out.println(catalogoLivros.pesquisarPorAutor("2"));





    }



}
