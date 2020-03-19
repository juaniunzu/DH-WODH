package com.company.criatura;

public class Dragon extends Criatura {

  public Dragon(String nombre, Double nivelAtaque) {
    super(nombre, nivelAtaque);
  }

  public void volar(){
    System.out.println(this.getNombre() + " se eleva en vuelo");
  }

  public void lanzarFuego(){
    System.out.println("Cuidado con las llamas!");
  }

}
