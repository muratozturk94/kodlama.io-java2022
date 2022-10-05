
public class miniProjeAsalSayı {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number%2;
		if(remainder == 0) {
			if(number == 2) {
				System.out.println(number + "asal sayıdır.");
			}else {
				System.out.println(number + "asal sayı değildir.");
			}
		}else {
			int bolen = 0;
			for(int i = 1;i<number;i+=2) {
				if(number%i == 0) {
					bolen += 1;
				}
			}
			if(bolen == 1) {
				System.out.println(number + "asal sayıdır.");
			}else {
				System.out.println(number + "asal sayı değildir.");
			}
		}
		
	}

}
