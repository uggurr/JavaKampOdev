package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager extends GamerCheckManager implements GamerService{
	
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkPerson(gamer)) {
			System.out.println("Gamer added :" + gamer.getFirstName());
			
		}else {
			System.out.println("Error --- The person not valid.");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer Updated : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted :" + gamer.getFirstName());
		
	}

}
