package odevIki_Iki;

public class Main {

	public static void main(String[] args) {
		Buttons buttons = new Buttons();
		buttons.id=1;
		buttons.name="Kaydet ve ilerle";
		
		Buttons buttons2 = new Buttons();
		buttons2.id=2;
		buttons2.name="Önceki Ders";
		
		Buttons buttons3 = new Buttons();
		buttons3.id=3;
		buttons3.name="Gönder";
		
		ButtonManager buttonManager = new ButtonManager();
		buttonManager.avtiveButton(buttons);
		buttonManager.avtiveButton(buttons2);
		buttonManager.avtiveButton(buttons3);
		

	}

}
