package exercicio02trabalho;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02Trabalho {

    public static void main(String[] args) {
        
        Editora e1 = new Editora();
        e1.setCodigo(1);
        e1.setNome("Educacional");
        
        Livro livro1 = new Livro();
        livro1.setCodigo(25);
        livro1.setAno(2010);
        livro1.setTitulo("Programação");
        
        Autor autor1 = new Autor();
        autor1.setCodigo(200);
        autor1.setNome("João");
        
        Autor autor2 = new Autor();
        autor2.setCodigo(201);
        autor2.setNome("Maria");
        
        List <Autor> listaautor1 = new ArrayList<Autor>();
        listaautor1.add(autor1);
        listaautor1.add(autor2);
        
        List <Livro> lista1 = new ArrayList<Livro>();
        lista1.add(livro1);
        
        livro1.setAut(listaautor1);
        e1.setLiv(lista1);
        
        
        
        Livro livro2 = new Livro();
        livro2.setCodigo(40);
        livro2.setAno(2015);
        livro2.setTitulo("Java");
        
        Autor autor3 = new Autor();
        autor3.setCodigo(300);
        autor3.setNome("Antonio");
        
        List <Autor> listaautor2 = new ArrayList<Autor>();
        listaautor2.add(autor3);
        
        livro2.setAut(listaautor2);
        lista1.add(livro2);
        e1.setLiv(lista1);
        
        
        e1.imprimirEditora();
        
        
        Editora e2 = new Editora();
        e2.setCodigo(2);
        e2.setNome("Tecnologia");
        
        Livro livro3 = new Livro();
        livro3.setCodigo(50);
        livro3.setAno(2020);
        livro3.setTitulo("C/C++");
        
        Autor autor4 = new Autor();
        autor4.setCodigo(400);
        autor4.setNome("Carla");
        
        Autor autor5 = new Autor();
        autor5.setCodigo(500);
        autor5.setNome("Júlia");
        
        Autor autor6 = new Autor();
        autor6.setCodigo(600);
        autor6.setNome("Joana");
        
        List<Autor> listaautor3 = new ArrayList<Autor>();
        listaautor3.add(autor4);
        listaautor3.add(autor5);
        listaautor3.add(autor6);
        
        livro3.setAut(listaautor3);
        
        List<Livro> lista2 = new ArrayList<Livro>();
        lista2.add(livro3);
        
        e2.setLiv(lista2);
        
        e2.imprimirEditora();
        
        
        
    }
    
}
