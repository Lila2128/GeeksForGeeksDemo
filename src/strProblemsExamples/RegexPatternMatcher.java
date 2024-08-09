package strProblemsExamples;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatternMatcher {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());
		
		while(testCase>0) {
			
			String pattern = sc.nextLine();
			
			try {
				
				Pattern.compile(pattern);
				System.out.println("Valid");
			}catch(PatternSyntaxException p) {
				System.out.println("Invalid");
			}
			
			testCase--;
		}
		sc.close();
	}

}
