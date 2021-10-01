package exercicio02trabalho;

import java.util.ArrayList;
import java.util.List;


public class Editora {
    private int codigo;
    private String nome;
    private List<Livro> liv = new ArrayList<Livro>();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLiv() {
        return liv;
    }

    public void setLiv(List<Livro> liv) {
        this.liv = liv;
    }
   
    void imprimirEditora(){
        System.out.println("Código: " + codigo);
        System.out.println("Editora: " + nome);
        System.out.println("******* Livros *****");
        for(Livro l : liv){           
            System.out.println("Título: " + l.getTitulo() );
            System.out.println("Código Livro: " + l.getCodigo());
            System.out.println("Ano: " + l.getAno());
            
            l.imprimirAutor();
            System.out.println("**************************");
        }
        System.out.println("\n");
    }
    
}
