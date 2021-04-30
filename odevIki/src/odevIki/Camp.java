package odevIki;

public class Camp {
	int id;
	String name;
	String image;
	String teacher;
	double percent;
	
	public Camp(int id, String name, String image, String teacher, double percent){
		this.id=id;
		this.name=name;
		this.image=image;
		this.teacher=teacher;
		this.percent=percent;
	}
	
	public Camp() {
		System.out.println("Boþ referanslar kýzmasýn diye parametresiz constructor oluþturdum.");
	}

}
