package edureka;

public class divisionByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=50, b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divide by zero");
		}

		try {
			int[] ar=new int[5];
			ar[9]=10;
			
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Index Out Of Bounds Exception");
		}
	}

}
