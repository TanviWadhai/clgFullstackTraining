package clgFullstack;

import java.util.StringTokenizer;

public class noOfwords {

	public static void main(String[] args) {
		String s="department of artificial intelligence";
		StringTokenizer st=new StringTokenizer(s);

//		int count=st.countTokens();
//		System.out.print(count);
		int count=0;
		while(st.hasMoreTokens()==true) {
			String word=st.nextToken();
			count=count+1;
	     }
		System.out.println("number of Tokens in String is :" + count);
	}	
}
