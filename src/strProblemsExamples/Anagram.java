package strProblemsExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String string1 = scn.nextLine();
		String string2 = scn.nextLine();
		
		Anagram ana = new Anagram();
		System.out.println(ana.anagram2(string1, string2));
		
		scn.close();
	}
	//Sorting way
	public boolean anagram(String string1, String string2) {
		byte []arr1 = new byte[string1.length()];
		byte []arr2 = new byte[string2.length()];
		
		for(int i=0; i<string1.length(); i++) {
			arr1[i] = (byte) string1.charAt(i);
		}
		for(int i=0; i<string2.length(); i++) {
			arr2[i] = (byte) string2.charAt(i);
		}
		Arrays.sort(arr1);
		String res1 = new String(arr1);

		Arrays.sort(arr2);
		String res2 = new String(arr2);

//		System.out.println(res1 + " "+ res2);
		if(res1.equals(res2)) {
			return true;
		}
		return false;
	}
	
	static final int CHAR = 256;
	//Frequency Counting
	public boolean anagram2(String s1, String s2) {

		if(s1 == null && s2 == null) return true;
        if(s1 == null || s2 == null) return false;
        
        if(s1.isEmpty() && s2.isEmpty()) return true;
        if(s1.isEmpty() || s2.isEmpty()) return false;
    
        char[] str1 = s1.toLowerCase().toCharArray();
        char[] str2 = s2.toLowerCase().toCharArray();
        int[] count = new int[CHAR];
        
        if(s1.length() == s2.length()){
            for(int i =0; i<s1.length(); i++){
                count[str1[i] -'a']++;
                // System.out.println("s1: "+(s1.charAt(i) -'a'));
                // System.out.println("1: "+count[str1[i] -'a']);
                count[str2[i] -'a']--;
                // System.out.println("s2: "+(s2.charAt(i) -'a')); 
                // System.out.println("2: "+count[str2[i] -'a']);
            } 
            String res = "yes";
            int i =0;
            while(i<CHAR){
                if(count[i] !=0){
                    res = "no";
                    break;
                }
                i++;
            }
            if(res == "yes"){
                return true;
            }    
        }
        return false;
	}

}
