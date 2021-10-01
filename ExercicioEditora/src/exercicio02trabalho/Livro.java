package exercicio02trabalho;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int codigo, ano;
    private String titulo;
    private List<Autor> aut = new ArrayList<Autor>();
    
    
    void imprimirAutor(){
        for(Autor a : aut){
            System.out.println("Código autor: " + a.getCodigo() );
            System.out.println("Nome do autor: " + a.getNome() );
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAut() {
        return aut;
    }

    public void setAut(List<Autor> aut) {
        this.aut = aut;
    }
    
    
    
}
