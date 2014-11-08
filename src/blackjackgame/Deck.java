/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

public class Deck {

private static Carta[] deck;

private int robadas;

public Deck() {
	deck = new Carta[52];
	int nuevas = 0;
	for (int palo = 1; palo <= 4; palo++ ) {
		for (int valor = 1; valor <= 13; valor++ ) {
			deck[nuevas] = new Carta(valor,palo);
			nuevas++;
		}
	}
	robadas = 0;
}

public void shuffle() {
	for ( int i = 51; i > 0; i-- ) {
		int rand = (int)(Math.random()*(i+1));
		Carta temp = deck[i];
		deck[i] = deck[rand];
		deck[rand] = temp;
	}
robadas = 0;
}

public int restantes() {
	return 52 - robadas;
}
// Cuando robamos una carta cogemos la primera del mazo y actualizamos el
//array de cartas vistas
public Carta hit() {
	robadas++;
	return deck[robadas-1];
}
}

