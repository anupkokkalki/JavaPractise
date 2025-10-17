package Handlingexceptions;

public class Test {
	
	void m1()
	
	{
		m2();
	}void m2()
	{
		m3();
		
	}
	void m3()
	{
		try{System.out.println(10/0);}	
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			throw new RuntimeException("some exception occured");
		}
		finally
		{
			System.out.println("finally block");
		}}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();	
			t.m1();
			
	}

}
