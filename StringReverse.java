package com.string;

public class StringReverse {

	public static void main(String[] args) {
		String str ="Neha";
//		StringBuffer sb= new StringBuffer(str);
//		System.out.println(sb.reverse());
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
