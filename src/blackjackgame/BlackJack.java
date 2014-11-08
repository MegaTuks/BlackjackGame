package blackjackgame;

public class BlackJack {
	public static void main(String[] args){
            Mano manoJugador = new Mano();
            Mano manoDealer = new Mano();
            Deck deck = new Deck();

        int puntaje;
 		
        
                
        
        for(int i=0;i<2;i++){
            manoJugador.pideCarta(deck.hit());
	}
        System.out.println("tu acumulado es: "+manoJugador.getAcumulado());
}
}
