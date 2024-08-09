package strProblemsExamples;

import java.util.Scanner;

public class SubStrings {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		SubStrings ss = new SubStrings();
		ss.SubString(s1);
		
		sc.close();
	}

	public void SubString(String s1) {
//		
		s1 = s1.trim();
		
		String [] words = s1.split("[!@,. ?']+");
		
		if(s1.length()==0) {
			System.out.println("0");
		}else
			System.out.println(words.length);
		
		for(String word : words) {
			System.out.println(word);
		}
	}
}
