package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

//classe para acessar o banco de dados
public class Banco {
  
  private static List<Usuario> lista = new ArrayList<>();

  public void adiciona(Usuario usuario) {
    Banco.lista.add(usuario);  
  }
  
  public List<Usuario> getUsuarios(){
    return Banco.lista;
  }

}
