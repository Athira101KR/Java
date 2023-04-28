package codeShef;

import java.util.Scanner;

public class consecutiveConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("num");
			int a=sc.nextInt();
			System.out.println("string");
			String s=sc.next();
			if(s.equals(null))
				s=sc.nextLine();
			//System.out.println(i+"  "+a+"  "+s);
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
					count++;
			}
			if(count==a)
			  System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
