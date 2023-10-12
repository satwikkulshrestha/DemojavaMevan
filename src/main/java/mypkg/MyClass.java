package mypkg;

import java.util.Scanner;

public class MyClass {
	public int arearect(int l, int b)
	{
		return (l*b); 
	}
	public float areacicle(float r)
	{
		return (float) (3.14*r*r); 
	}
	public void show()
	{
		System.out.println("Hello GFG");
	}
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int l;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		l=sc.nextInt();
		System.out.println("Enter Breadth : ");
		b=sc.nextInt();
		System.out.println("Area of rectangle is : "+ob.arearect(l,b) );
	
	}

}