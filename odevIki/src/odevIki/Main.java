package odevIki;

public class Main {

	public static void main(String[] args) {
		
		Camp camp1 = new Camp(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Kamp1 Resmi","Engin Demiro�",88);
		
		Camp camp2 = new Camp();
		camp2.id=2;
		camp2.name="Programlamaya Giri� Temel Kurs";
		camp2.image="Kamp2 Resmi";
		camp2.teacher="Engin Demiro�";
		camp2.percent=100;
		
		Camp camp3 = new Camp();
		camp3.id=3;
		camp3.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		camp3.image="Kamp2 Resmi";
		camp3.teacher="Engin Demiro�";
		camp3.percent=92;
		
		System.out.println("---------------------------KAMPLAR----------------------");
		
		Camp[] camps = {camp1,camp2,camp3};
		for (Camp camp : camps) {
			System.out.println("id :" + camp.id + "//" + "Kamp Ad� :" + camp.name + "//" + "Resim :" + camp.image + "//"
					+ "Kamp Hocas� :" + camp.teacher + "//" + "Y�zdelik Durum :" + camp.percent);
			System.out.println("----------------------------------------------------");
		}

	}

}
