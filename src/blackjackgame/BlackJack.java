package blackjackgame;

public class BlackJack {
	public static void main(String[] args){
            Mano manoJugador = new Mano();
            Mano manoDealer = new Mano();
            Deck deck = new Deck();

        int puntaje;
 		
        manoJugador.pideCarta(deck.hit());
                
        
        for(int i=0;i<3;i++){
            System.out.println("tu acumulado es: "+manoJugador.getAcumulado());
	}

}
}
