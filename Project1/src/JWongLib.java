
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
	public static void vigCipher(String code) { // shift of 4; A=E ... Z=C
		int z = 0;
		String secret = "";
		while (z <= code.length())
			
		{
			if (code.charAt(z) == 'A')
			{
				secret += "E";
				z++;
			}
			else if (code.charAt(z) == 'B')
			{
				secret += "F";
				z++;
			}
			else if (code.charAt(z) == 'C')
			{
				secret += "G";
				z++;
			}
			else if (code.charAt(z) == 'D')
			{
				secret += "H";
				z++;
			}
			else if (code.charAt(z) == 'E')
			{
				secret += "I";
				z++;
			}
			else if (code.charAt(z) == 'F')
			{
				secret += "J";
				z++;
			}
			else if (code.charAt(z) == 'G')
			{
				secret += "K";
				z++;
			}
			else if (code.charAt(z) == 'H')
			{
				secret += "L";
				z++;
			}
			else if (code.charAt(z) == 'I')
			{
				secret += "M";
				z++;
			}
			else if (code.charAt(z) == 'J')
			{
				secret += "N";
				z++;
			}
			else if (code.charAt(z) == 'K')
			{
				secret += "O";
				z++;
			}
			else if (code.charAt(z) == 'L')
			{
				secret += "P";
				z++;
			}
			else if (code.charAt(z) == 'M')
			{
				secret += "Q";
				z++;
			}
			else if (code.charAt(z) == 'N')
			{
				secret += "R";
				z++;
			}
			else if (code.charAt(z) == 'O')
			{
				secret += "S";
				z++;
			}
			else if (code.charAt(z) == 'P')
			{
				secret += "T";
				z++;
			}
			else if (code.charAt(z) == 'Q')
			{
				secret += "U";
				z++;
			}
			else if (code.charAt(z) == 'R')
			{
				secret += "V";
				z++;
			}
			else if (code.charAt(z) == 'S')
			{
				secret += "W";
				z++;
			}
			else if (code.charAt(z) == 'T')
			{
				secret += "X";
				z++;
			}
			else if (code.charAt(z) == 'U')
			{
				secret += "Y";
				z++;
			}
			else if (code.charAt(z) == 'V')
			{
				secret += "Z";
				z++;
			}
			else if (code.charAt(z) == 'W')
			{
				secret += "A";
				z++;
			}
			else if (code.charAt(z) == 'X')
			{
				secret += "B";
				z++;
			}
			else if (code.charAt(z) == 'Y')
			{
				secret += "C";
				z++;
			}
			else if (code.charAt(z) == 'Z')
			{
				secret += "D";
				z++;
			}
		}
		System.out.println(secret);
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
