package Handlingexceptions;

import java.util.Scanner;

public class TestExceptions {
	
	
    public void validateAge(int age)
    {
    	if(age<18)
		{
			throw new ArithmeticException("not valid age to vote");
		}
		else
		{
			System.out.println("welcome to vote");
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the age");
		int age=s.nextInt();
		TestExceptions t=new TestExceptions();
		t.validateAge(age);
		s.close();
		System.out.println("rest of the code");

	}

}
