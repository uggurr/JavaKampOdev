package Concrete;


import Abstract.CampaignService;
import Abstract.GamerService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {
	
	GamerService gamerService;

	public SaleManager(GamerService gamerService) {
		this.gamerService = gamerService;
	}
	
	CampaignService campaignService;


	public SaleManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}


	@Override
	public void sale(Gamer gamer, Game game,Campaign campaign) {
		System.out.println("Gamer name :" + gamer.getFirstName());
		System.out.println("Game name :" + game.getName());
		System.out.println("Campaign name :" + campaign.getCampaignName() + "//" + "Discount rate :" + campaign.getDiscount());
		
	}

}
