/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

/**
 *
 * @author juan__000
 */
public class Jugador {
    private Mano mano;
    private int puntaje;
    
    public void hit(Carta c) {
    mano.pideCarta(c);
}
    public int getPuntaje(){return puntaje;}
   // public Carta getCarta(){//return carta;
        
   // }
  //  public void hit(){ getCarta();}
    public boolean stand(){return true;}
}
