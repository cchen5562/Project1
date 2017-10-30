
public class CChenLib {
	public static boolean isPalindrome(String str) {
		int a = 0;
		int b = str.length()-1;
		while(b > a) {
			if(str.charAt(a) != str.charAt(b)) {
				return false;
			}a++;
		     b--;
		} return true;
	} 
	
		public static void dateStr() {
			int m;
			int d;
			int y;
			if(System.out.println("mm/dd/yyyy"));
				System.out.println("dd - mm - yyyy");
		} 
	
	public static void sumUpTo(int p) {
		int o;
		int z = 0;
		for(o = 0; o <= p; o++) {
			if(o < p)
			{
				z = o + z;
			} else {
			System.out.println(z + p);
			}
		}
	}
}