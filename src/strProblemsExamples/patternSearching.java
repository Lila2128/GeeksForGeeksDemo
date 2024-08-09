package strProblemsExamples;

import java.util.Scanner;

public class patternSearching {

	static void patSearch(String text, String pat) {
		int pos = text.indexOf(pat);
		
		while(pos>=0) {
			System.out.println(pos + " ");
			pos = text.indexOf(pat ,pos+1);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.nextLine();
		String pat = sc.nextLine();
		
		patSearch(txt,pat);
		sc.close();
	}
}
