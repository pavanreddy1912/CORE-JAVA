package com.gqt.fstrainings.strings;

/**
 * @author pavan
 *
 */
public class equalsignorecase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Banu");
		String s2 = new String("banu");
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}
	}

}
