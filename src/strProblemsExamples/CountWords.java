package strProblemsExamples;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "geeks";
		String b = "vnjb nsjpjbjlmbvrekhawnvrmpytfvdgqbjznxwruzlkkyi";
		System.out.println(new CountWords().Words(b));
		String str = s.substring(1, s.length()-1);
		System.out.print(s.toUpperCase().charAt(0));
		System.out.println(s.substring(1));
//		System.out.println(s.charAt(0).toUpperCase());
System.out.println(str);
		int arr[] = new int[256];

		char c1='a';
		char c2='z';
		for(char i=c1; i<=c2; i++){
		    System.out.print(i + " ");
		    
		   arr[s.charAt(i)-'a']++;
		   System.out.println(arr[i]);
		}
	}
	
	public int Words(String txt) {
		int count = 1;
		int n=0;
		for(char c: txt.toCharArray()) {
			if(c ==' ') {
				count++;
			}
		}
		System.out.println("completed");
		return count++;
	}

}
