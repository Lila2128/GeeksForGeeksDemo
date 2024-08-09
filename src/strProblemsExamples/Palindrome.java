package strProblemsExamples;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "abbabba";
		boolean palindrome = isPalinWhile(s);
		if(palindrome)
			System.out.println("True");
		else
			System.out.println("False");
		
		
	}
	//Using While loop:
	public static boolean isPalinWhile(String s) {
		
		int start =0;
		int end = s.length()-1;
		boolean isPal = true;
		
		while(start<end) {
			if(s.charAt(start)!= s.charAt(end)) {
				isPal = false;
				break;
			}
			start++; end--;
		}
		if(isPal == false)
			return false;
		return true;
	}

	//Using array and trascand it.
	public static boolean isPalinArray(String s){
	    // code here
		int n = s.length();
		String newS = s.toLowerCase();
		byte arr[] = new byte[n];
	    byte arr1[] = new byte[n];

	    for(int i=0; i<n; i++) {
	    	arr[i]= (byte) newS.charAt(i);
	    	System.out.print((char)arr[i]);
	    }
	    for(int i=0; i<n; i++) {
	    	arr1[i]= (byte) newS.charAt(n-1-i);
	    	System.out.print((char)arr1[i]);
	    }
	    
	    for(int i=0; i<n; i++) {
	    	if(arr[i] == arr1[i]) {
//	    		System.out.println("printing");
		    	return true;
		    }
	    }
	    
	   return false; 
	}
}
