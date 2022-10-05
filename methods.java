
public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean check = false;
		
		for(int i =0; i<sayilar.length;i++) {
			if (sayilar[i] == aranacak) {
				check = true;
				break;
			}
		}
		
		if(check) {
			mesajVer("Sayı array in içindedir:" +aranacak);
		}else {
			mesajVer("Sayı array in içinde değildir:" +aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
