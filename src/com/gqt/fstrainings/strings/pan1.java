package com.gqt.fstrainings.strings;
import java.util.Scanner;
public class pan1  
{  
 
public static void containAllLetters(String string)  
{  
 
string = string.toLowerCase();  
boolean allLetterPresent = true;  

for (char ch = 'a'; ch <= 'z'; ch++)   
{   
if (!string.contains(String.valueOf(ch)))   
{  
allLetterPresent = false;  
break;  
}  
}  
 
if (allLetterPresent)  
  
System.out.println("Pangram String");  
else  
  
System.out.println("Not a Pangram String");  
} 

public static void main(String args[])  
{  
 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
String string = sc.nextLine();
  
containAllLetters(string);  
}  
}  

