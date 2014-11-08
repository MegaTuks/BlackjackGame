package blackjackgame;
import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args){
          Scanner s =new Scanner(System.in); 
          int n;
            Mano manoJugador = new Mano();
            Mano manoDealer = new Mano();
            Deck deck = new Deck();
            
               for(int i=0;i<2;i++){
              manoJugador.pideCarta(deck.hit());    
             System.out.println("tu acumulado es: "+manoJugador.getAcumulado());
	}

      n = s.nextInt(); 
      while(n != 0)
      {
          n = s.nextInt(); 
          if(n==1)//hit
          { 
              manoJugador.pideCarta(deck.hit());
              System.out.println("tu acumulado es: "+manoJugador.getAcumulado());        
          
          }
          
          if(n==2) //deal
          { 
             manoJugador.tirarCartas();
             deck.shuffle();
             for(int i=0;i<2;i++){
              manoJugador.pideCarta(deck.hit());    
             System.out.println("tu acumulado es: "+manoJugador.getAcumulado());
	}
         }
              
      }
        
        
 		
        

}
        
        
}
