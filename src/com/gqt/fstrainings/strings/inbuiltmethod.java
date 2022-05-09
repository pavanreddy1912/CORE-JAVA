package com.gqt.fstrainings.strings;


/**
 * @author pavan
 *
 */
public class inbuiltmethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "pavanbhavanabanu";
		System.out.println("The main string : "+s1);
		String res1=s1.toUpperCase();
		System.out.println("The upper Case : "+res1);
		String res2=s1.toLowerCase();
		System.out.println("The Lower case : "+res2);
		boolean res3=s1.startsWith("pavan");
		System.out.println("Starts with result : "+res3);
		boolean res4=s1.endsWith("banu");
		System.out.println("Ends with result : "+res4);
		
	}

}
