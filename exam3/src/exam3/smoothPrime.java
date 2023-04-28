package exam3;

import java.util.Scanner;

public class smoothPrime {
	
	static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=2)
			return false;
		for(int i=0;i<n/2;i++)	
			if(n%2==0)
				return false;
			
			return true;
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean b=isPrime(n);
		//System.out.print(b);
		if(isPrime(n-1)&&isPrime(n+1))
		{
			System.out.println("yes"+ (n-1)+" "+(n+1));
		}
		else
			System.out.println("no");
		
		
	}
	

//	private static boolean isPrime(int n) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}






