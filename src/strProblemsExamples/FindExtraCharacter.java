package strProblemsExamples;

import java.util.Arrays;
import java.util.Scanner;

public class FindExtraCharacter {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		
		FindExtraCharacter fec = new FindExtraCharacter();
		
//		System.out.println(fec.findExtra(s1, s2));
//		System.out.println(extraChar(s1,s2));
		System.out.println(extraXORChar(s1,s2));
		scn.close();
	}
	//Using Count array.
	char findExtra(String s1, String s2) {
		int count[] = new int[26];
		int n = s1.length();
		for(int i=0; i<n; i++) {
			count[s1.charAt(i)-'a']--;
			count[s2.charAt(i)-'a']++;
//			System.out.println(count[i]);
//			System.out.print("s1");
//			System.out.println(s1.charAt(i)-'a');
//			System.out.print("s2");
//			System.out.println(s2.charAt(i)-'a');
		}
		count[s2.charAt(n)-'a']++;
		
		for(int i=0;i<26;i++) {
//			System.out.print(count[i]+ " ");
			if(count[i]==1)
				return (char)(i+'a');
		}
		
		return 0;
	}
	
	//Using bitwise XOR-----
	public static char extraXORChar(String s1, String s2) {
		int res = 0;
		int n = s1.length();
		
		for(int i = 0; i<n; i++) {
			res = res ^ s1.charAt(i) ^ s2.charAt(i);
		}
		res = res ^ s2.charAt(n);
		
		return (char) res;
		
	}
	
	//Using sorting. ------ error. try to fetch the char.
	public static char extraChar(String s1, String s2){

	    //write your code here
	   char n = s2.charAt(s2.length()-1);
	    // int arr[] = new int[26];
	    byte arr1[] = new byte[s1.length()];
	    byte arr2[] = new byte[s2.length()];
	    
	    for(int i=0; i<s1.length(); i++){
	        arr1[i] = (byte)s1.charAt(i);
	    }
	    for(int i=0; i<s2.length(); i++){
	        arr2[i] = (byte)s2.charAt(i);
	    }
	    
	    Arrays.sort(arr1);
	    // String res1 = new String(arr1);
	    Arrays.sort(arr2);
	    // String res2 = new String(arr2);

	   // ------Error--------
	    for(int i=0; i<s2.length(); i++){
//	    	System.out.println((char)arr2[i]);
	    	
	    	for(int j=0; j<s1.length(); j++) {
//	    		System.out.println((char)arr1[j]);
		        if( (char)arr2[i] == (char)arr1[j]){
	//	          return (char)arr2[i];
		        	break;
		        }
		        return (char)arr2[i];
	    	}
	    }
	    
	    return n;
	    
	}

}
