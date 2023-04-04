package com.basicjavaday1;

public class demonstrateStaticvariable {
	static int x = 25;
	static int y;
	static void func(int z) {
	   System.out.println("x = " + x);
	   System.out.println("y = " + y);
	   System.out.println("z = " + z);
	}
	static {
		   System.out.println("Running static initialization block.");
		   y = x + 5;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 func(8);
	}

}
