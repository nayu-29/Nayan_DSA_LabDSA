package com.gl.stackparanthesis;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.next();
		
		MyStack ms=new MyStack();
		if(input.length()%2==1)
		{
			System.out.println("The entered String do not contain Balanced Brackets");
		}
		else
		{
			if(ms.validate(input))
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("The entered String do not contain Balanced Brackets");
		}
	}

}
