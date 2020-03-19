package com.company.heroe;

import com.company.criatura.Criatura;

public abstract class Heroe {

  protected Double nivelExperiencia;
  private String nombre;

  public Heroe(Double nivelExperiencia, String nombre) {
    this.nivelExperiencia = nivelExperiencia;
    this.nombre = nombre;
  }

  public abstract void lucharConCriatura(Criatura unaCriatura);

  public Double getNivelExperiencia() {
    return nivelExperiencia;
  }

  public String getNombre() {
    return nombre;
  }
}
