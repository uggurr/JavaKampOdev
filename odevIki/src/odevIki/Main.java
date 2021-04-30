package odevIki;

public class Main {

	public static void main(String[] args) {
		
		Camp camp1 = new Camp(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Kamp1 Resmi","Engin Demiroð",88);
		
		Camp camp2 = new Camp();
		camp2.id=2;
		camp2.name="Programlamaya Giriþ Temel Kurs";
		camp2.image="Kamp2 Resmi";
		camp2.teacher="Engin Demiroð";
		camp2.percent=100;
		
		Camp camp3 = new Camp();
		camp3.id=3;
		camp3.name="Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		camp3.image="Kamp2 Resmi";
		camp3.teacher="Engin Demiroð";
		camp3.percent=92;
		
		System.out.println("---------------------------KAMPLAR----------------------");
		
		Camp[] camps = {camp1,camp2,camp3};
		for (Camp camp : camps) {
			System.out.println("id :" + camp.id + "//" + "Kamp Adý :" + camp.name + "//" + "Resim :" + camp.image + "//"
					+ "Kamp Hocasý :" + camp.teacher + "//" + "Yüzdelik Durum :" + camp.percent);
			System.out.println("----------------------------------------------------");
		}

	}

}
