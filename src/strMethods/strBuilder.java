package strMethods;

public class strBuilder {
	
	public static void main(String[] args) {
		
		String s1 = "geeks";
		String s2 = s1;
		
		s1 = s1 + "forGeeks";
		if(s1 == s2) {
			System.out.println("same");
		}else
			System.out.println("not same");
		
		
		StringBuilder sb1 = new StringBuilder("geeks");
		StringBuilder sb2 = sb1;
		sb1 = sb1.append("forGeeks");
		
		if(sb1 == sb2)
			System.out.println("same");
		else
			System.out.println("not same");
	}
}
