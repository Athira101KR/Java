package edureka;

public class throwsExample {

	static void avg() throws ArithmeticException
	{
		System.out.println("inside the method");
		throw new ArithmeticException("demo");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			avg();
		}
		finally
		{
			System.out.println("caught");
		}
	}

}
