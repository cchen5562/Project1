
public class JWongLib {
	public static boolean isPerfectSquare(int p) {
		int y = 0;
		while (y <= p) {
			if ((y * y) == p);
			return true;
		}
		y++;
		return false;
	}
	
	//Vigenere Cipher chart: https://tinyurl.com/ybydczow
	public static void vigCipher() { // shift of 4; A=E ... Z=C
		
	}
	//public static boolean isFibonacci() {
		
	//}
	
	public static void multiplicationTable(int b, int r) {
		//b = base ... r = range
		int x = 0;
		while (x <= r) {
			System.out.println(b*x);
			x++;
		}	
	}
}
