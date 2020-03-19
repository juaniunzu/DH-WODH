package com.company.criatura;

public class Criatura {

  private String nombre;
  private Double nivelAtaque;

  public Criatura(String nombre, Double nivelAtaque) {
    this.nombre = nombre;
    this.nivelAtaque = nivelAtaque;
  }

  public String getNombre() {
    return nombre;
  }

  public Double getNivelAtaque() {
    return nivelAtaque;
  }
}
