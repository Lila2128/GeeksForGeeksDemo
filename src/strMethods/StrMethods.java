package strMethods;

public class StrMethods {
	
	public static void main(String[] args) {
		String str = "gleekseeyee";
		
		String str1 = str + " for geeks";
		System.out.println(str);
		
//		System.out.println(str1 == str);
//		System.out.println(str.charAt(1));
//		System.out.println(str1.substring(3, 10));
//		System.out.println(str.substring(2));
//		System.out.println(str1.toUpperCase());
//		char[] arr = str1.toCharArray();
//		
//		for(int i=0; i<arr.length; i++) {
//		System.out.println("char at index number: "+ i+ " is "+ arr[i]);
//		}
		
		System.out.println(str.lastIndexOf("ee", 10));
	}

}
