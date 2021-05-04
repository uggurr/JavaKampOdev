package odevBes;

import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1,"Uður","Yýldýz","1234567890","19.08.2000");
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		
		Campaign campaign1 = new Campaign(1,"Yaz Kampanyasý");
		
		
		System.out.println("---------------------Oyun Satýþý-------------------");
		
		Game game1 = new Game(1,"LOL",85.90);
		
		SaleManager saleManager = new SaleManager(gamerManager);
		saleManager.sale(gamer1, game1,campaign1);
		

	}

}
