package Entities;

public class Campaign {
	int id;
	String CampaignName;
	double discount;
	
	public Campaign() {
		
	}
	
	
	public Campaign(int id, String campaignName) {
		
		this.id = id;
		this.CampaignName = campaignName;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return CampaignName;
	}


	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}


	public double getDiscount() {
		return  discount ;
	}



}
