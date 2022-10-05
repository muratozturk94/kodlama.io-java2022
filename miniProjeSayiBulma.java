
public class miniProjeSayiBulma {
	public static void main(String[] args) {
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
			System.out.println("Sayı array in içindedir.");
		}else {
			System.out.println("Sayı array in içinde değildir.");
		}
	}

}
