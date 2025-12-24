package clgFullstack;

import java.util.StringTokenizer;

public class ReverseArray {

	public static void main(String[] args) {
		String s="department of artificial intelligence";
		StringTokenizer st=new StringTokenizer(s," ");
		char ch[]=s.toCharArray();
		while(st.hasMoreTokens()==true) {
			String word=st.nextToken();
			
			for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
		}
		 System.out.println();
		 
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
