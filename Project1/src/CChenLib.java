
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
	
		public static void dateStr(String str) {
			String month = str.substring(0, 2);
			String day = str.substring(3 ,5);
			String year = str.substring(6, str.length()-1);
			String connect = " -";
			
			System.out.println(day + connect + month + connect + year);
			
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