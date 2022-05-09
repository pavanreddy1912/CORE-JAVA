package com.gqt.fstrainings.strings;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("Bhavana");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		StringBuffer sb1 = new StringBuffer("Bhavana");
		System.out.println(sb.compareTo(sb1));
		sb.delete(4, 6);
		System.out.println(sb);
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
	}

}
