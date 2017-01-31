import java.util.ArrayList;

public class Anagram {
	public static void main (String[] args) {
		String s = "abcde";
		String p = "dc";
		int sl = s.length(), pl=p.length();
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for (int i=0; i<sl-pl+1;i++) {
			String cur=s.substring(i,i+pl);
			boolean b = helper(cur,p);
			
			if (b==true) {
				al.add(i);
			}
		}

		for (int i : al){
			System.out.println(i);
		}

	}
	
	public static boolean helper(String a, String b) {
		
		int[] chars = new int[26];
		
		for (char ch : a.toCharArray()) {
			chars[ch-'a']++;
		}
		
		for (char ch : b.toCharArray()) {
			chars[ch-'a']--;

			if (chars[ch-'a']<0)
				return false;
		}
		
		
		return true;	
	}
	
}
