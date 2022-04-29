package com.suren.test;

import java.util.Scanner;

public class Hello {

	
	public static void main(String[] args) {

		int num;
		Scanner sc  = new Scanner(System.in);
		num =sc.nextInt();
		
			if(num %10 ==0) {
				System.out.println("zero");
			}
			else if(num%10 == 5) {
				System.out.println("five");
			}
			else if(num %2 == 0) {
				System.out.println("zero");
				
			}else {
				System.out.println("five");
			}
			
		}
	}

