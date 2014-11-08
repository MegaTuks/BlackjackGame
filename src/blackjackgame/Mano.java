/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;
import java.util.Vector;
import java.util.Random;

public class Mano {

private Vector mano;

public Mano() {
    mano = new Vector();
}

public void tirarCartas() {
    mano.removeAllElements();
}

public void pideCarta(Carta c) {
    if (c != null)
        mano.addElement(c);
}

public int cuentaC() {
    return mano.size();
}
// Nos dice la carta que tiene en la posicion pos
/*

asdfasdfasfsadfaasdf
asdfasdf



*/
public Carta obtenerCarta(int pos) {
    if (pos >= 0 && pos < mano.size())
        return (Carta)mano.elementAt(pos);
    else
        return null;
}
// Cuenta los puntos que suman las cartas de nuestra mano
/*

asdfasdfasfsadfaasdf
asdfasdf



*/
public int getAcumulado() {
	int val;
	int cartas;
	val = 0;
	cartas = cuentaC();
	for ( int i = 0; i < cartas; i++ ) {
		Carta carta;
		int cartaVal;
		carta = obtenerCarta(i);
		cartaVal = carta.getValor();
		if (cartaVal > 10) {
			cartaVal = 10;
		}
		val = val + cartaVal;
	}
        return val;
} 

}

