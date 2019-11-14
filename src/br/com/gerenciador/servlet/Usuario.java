package br.com.gerenciador.servlet;

import java.util.Date;

public class Usuario {
  
  private Integer id;
  private String nome;
  private Date dataNascimento = new Date();
  
  
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Date getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  
}
