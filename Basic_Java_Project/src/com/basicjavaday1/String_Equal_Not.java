package com.basicjavaday1;

import java.util.Scanner;

public class String_Equal_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter first String : ");
        str1 = scanner.nextLine();
 
        System.out.println("Enter second String : ");
        str2 = scanner.nextLine();
        // Comparing two input string
        if (str1.equals(str2))
            System.out.print("Equal Strings ");
        else
            System.out.print("UnEqual Strings");

	}

}
