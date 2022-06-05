package com.trybe.restaurante.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RestauranteDto {

  @NotBlank
  private String nome;

  @NotBlank
  @Size(min = 3)
  private String descricao;

  public RestauranteDto(Long id, String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  public RestauranteDto() {}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
