package com.gqt.fstrainings.strings;


/**
 * @author pavan
 *
 */
public class compareto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Banu");
		String s2 = new String("Banu");
		int res= s1.compareTo(s2);
		if(res==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}
	}

}
