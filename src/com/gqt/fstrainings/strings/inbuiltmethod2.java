package com.gqt.fstrainings.strings;

/**
 * @author pavan
 * description : checking the inbuilt functions of the strings
 */
public class inbuiltmethod2 {

	/**
	 * @param args
	 * @param s1
	 * @param res1
	 * @param res2
	 * @param res3
	 * @param res4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "pavanbhavanabanu";
		System.out.println("The main string : "+s1);
		boolean res1=s1.contains("bhavana");
		System.out.println("contains : "+res1);
		char res2=s1.charAt(10);
		System.out.println("The character at : "+res2);
		int res3=s1.length();
		System.out.println("the length is : "+res3);
		int res4=s1.indexOf("b");
		System.out.println("the index is : "+res4);
		System.out.println(s1.concat("jaan"));
		System.out.println(s1.getClass());
		System.out.println(s1.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.lastIndexOf("anu"));
		System.out.println(s1.lastIndexOf("a",10));
		System.out.println(s1.replace("banu", "jaan"));
		System.out.println(s1.replace("an", "bm"));
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.trim());
		char [] c=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+",");
		}
		System.out.println(s1.toString());
		System.out.println(s1.toUpperCase().equals("PAVANBHAVANABANU"));
	}

}