package edureka;

import java.util.Scanner;

class Sample
{
	public static void validateInput(int num) throws InvalidInputException
	{
		if(num>100)
			throw new InvalidInputException("Exception");
		System.out.println("Valid input");
	}
}

public class customException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		try {
			s.validateInput(num);
		}
		catch(InvalidInputException e)
		{
			System.out.println("caught-input grater than 100");
		}

	}

}

class InvalidInputException extends Exception
{
	InvalidInputException(String exceptionText){
		super(exceptionText);
	}
}
