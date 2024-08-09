package strMethods;

public class StrBuffer {
	
	public static void main(String [] args) {
		String a ="GFG";
		String b = new String("GFG");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(a));
		System.out.println(a==b);
		
		StringBuffer first = new StringBuffer("GFG");
		StringBuffer second = new StringBuffer("GFG");
		
		System.out.println(first.equals(second));
		System.out.println(first==second);
		System.out.println(first.equals(first));
		
		StringBuffer str = new StringBuffer("Hello");
		
		StringBuffer now = str;
		
		now = now.reverse().append(str.reverse());
		
		System.out.println(str);
		System.out.println(now);
		
	
}

}
