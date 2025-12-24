package clgFullstack;

import java.util.StringTokenizer;

public class sTokens {

	public static void main(String[] args) {
		String s="department of artificial intelligence";
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()==true) {
			System.out.println(st.nextToken());
		}

	}

}