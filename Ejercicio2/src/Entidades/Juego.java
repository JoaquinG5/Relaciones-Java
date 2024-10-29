package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Juego {

  private  List<Jugador>listaJugadores=new ArrayList();
    private Revolver revo; 

    public Juego() {
    }

    public Juego(Revolver revo) {
        this.revo = revo;
    }


    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getRevo() {
        return revo;
    }

    public void setRevo(Revolver revo) {
        this.revo = revo;
    }

    @Override
    public String toString() {
        return "Juego{" +  ", listaJugadores=" + listaJugadores + ", revo=" + revo + '}';
    }
  

}
