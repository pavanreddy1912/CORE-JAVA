package com.gqt.fstrainings.strings;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("Bhavana");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		StringBuilder sb1 = new StringBuilder("Bhavana");
		System.out.println(sb.compareTo(sb1));
		sb.delete(4, 6);
		System.out.println(sb);
	}

}
