package com.gqt.fstrainings.patterns;


import java.util.Scanner;

public class alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i =0; i<n;i++) {
			for( int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1||i==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1||i==(n/2)||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||i==(n/2)&&j<=n/2||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||i==(n/2)&&j<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||(i==(n-1)&&j<=n/2)||
						(j==(n/2)&&i>=(n/2))||
						j==n-1&&i>=(n/2)||
						i==(n/2)&&j>=(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||j==n-1||i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==n/2||i==0||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==n/2||i==0||i==n-1&&j<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||i+j==n/2||i-j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j&&i<=n/2||i+j==n-1&&i<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||j==n-1||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||j==n-1||i==0||i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1&&i<=n/2||i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0&&i<=3*n/4||i==0&&j<=3*n/4||i==3*n/4&&j<=3*n/4||j==3*n/4&&i<=3*n/4||i>=n/2&&i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0||j==n-1&&i<=n/2||i==n/2||i>=n/2&&i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==0&&i<=n/2||i==(n/2)||i==n-1||j==n-1&&i>=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(j==0||i==n-1||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==j&&i<=n/2||j+i==n-1&&i<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			for( int j=0;j<n;j++) {
				if(i==j&&i<=n/2||j+i==n-1&&i<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for( int j=0;j<n;j++) {
				if(i==j&&i<=n/2||j+i==n-1&&i<=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==j||j+i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==j&&i<=n/2||j+i==n-1&&i<=n/2||j==n/2&&i>=n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for( int j=0;j<n;j++) {
				if(i==0||i==n-1||j+i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}

