package strProblemsExamples;

import java.util.Scanner;

public class reverseString {
	
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String s = scn.nextLine();
		
		
		System.out.println(new reverseString().reverseBasic(s));
		
		scn.close();
	}

	public String reverseBasic(String s) {
		int n = s.length()-1;
		
		String b = "";
		
		while(n>=0) {
			b = b + s.charAt(n);
			n--;
		}
		return b;
	}

}
