/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

public class Carta {

public final static int SPADES = 1,
HEART = 2,
DIAMOND = 3,
PIQUES = 4;
public final static int AS = 1,
JACK = 11,
QUEEN = 12,
KING = 13;

private final int palo;
private final int valor;

public Carta(int val, int pal) {
	palo = pal;
	valor = val;
}

public int getPalo() {
	return palo;
}
public int getValor() {
	return valor;
}

}

