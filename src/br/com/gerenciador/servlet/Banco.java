package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//classe para acessar o banco de dados
public class Banco {
  
  private static List<Usuario> lista = new ArrayList<>();

  static {
    Usuario usuario = new Usuario();
    usuario.setNome("Julia");
    lista.add(usuario);
    Usuario usuario2 = new Usuario();
    usuario.setNome("joao henrique");
    lista.add(usuario2);
  }
  
  public void adiciona(Usuario usuario) {
    Banco.lista.add(usuario);  
  }
  
  public List<Usuario> getUsuarios(){
    return Banco.lista;
  }

}
