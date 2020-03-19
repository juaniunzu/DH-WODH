package com.company.heroe;

import com.company.criatura.Criatura;

public class Guerrero extends Heroe {

  private Double nivelVida;

  public Guerrero(Double nivelExperiencia, String nombre, Double nivelVida) {
    super(nivelExperiencia, nombre);
    this.nivelVida = nivelVida;
  }

  @Override
  public void lucharConCriatura(Criatura unaCriatura) {

    if(!puedeLuchar()){
      System.out.println("El guerrero " + this.getNombre() + " no puede luchar y deberá esperar su resurreción");
    }

    if(puedeLuchar() && unaCriatura.getNivelAtaque() < this.nivelExperiencia){
      this.nivelExperiencia++;
      System.out.println("El guerrero " + this.getNombre() + " ganó. Su experiencia sube a " + this.nivelExperiencia);
    }

    if(puedeLuchar() && unaCriatura.getNivelAtaque() >= this.nivelExperiencia){
      this.nivelVida = 0.0;
      System.out.println("El guerrero " + this.getNombre() + " perdió y quedó sin vida");
    }

  }

  protected Boolean puedeLuchar(){
    return(this.nivelVida > 0);
  }

  protected void setNivelVida(Double nivelVida) {
    this.nivelVida = nivelVida;
  }
}
