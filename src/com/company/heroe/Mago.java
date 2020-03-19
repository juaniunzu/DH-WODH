package com.company.heroe;

import com.company.criatura.Criatura;

public class Mago extends Heroe {

  public Mago(Double nivelExperiencia, String nombre) {
    super(nivelExperiencia, nombre);
  }

  public void resucitarGuerrero(Guerrero unGuerrero){
    if (unGuerrero.puedeLuchar()){
      System.out.println("El guerrero ya está vivo, no es necesario resucitarlo");
    } else {
      unGuerrero.setNivelVida(500.0);
      System.out.println(this.getNombre() + " revive al guerrero " + unGuerrero.getNombre());
    }
  }

  @Override
  public void lucharConCriatura(Criatura unaCriatura) {

    if(unaCriatura.getNivelAtaque() < this.nivelExperiencia){
      this.nivelExperiencia += 2;
      System.out.println("El mago " + this.getNombre() + " ganó, su experiencia sube a " + this.nivelExperiencia);
    } else {
      this.nivelExperiencia--;
      System.out.println("El mago " + this.getNombre() + " perdió, su experiencia baja a " + this.nivelExperiencia);
    }





  }
}
