package com.moduleTest;

import java.util.ArrayList;
import java.util.List;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;int res=1;
		List<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(2);
		al.add(6);
		al.add(1);
		//[2,4,2,6,1]
		for(int i=0;i<al.size();i++)
		{
			if(i<al.size()-1) {
			int c1=al.get(i);
			int c2=al.get(i+1);
			System.out.println(c1+" "+c2);
			//sum=c1+c2;
			if((c1+c2)%2!=0)
			{
				sum=sum+5;
			}
			}
		}
		System.out.println(sum);
		for(int i=0;i<al.size();i++)
		{
			if(i<al.size()-2) {
			int t1=al.get(i);
			int t2=al.get(i+1);
			int t3=al.get(i+2);
			int sumt=t1+t2+t3;
			int pro=t1*t2*t3;
			System.out.println(t1+" "+t2+" "+t3);
			if(sumt%2!=0 && pro%2==0)
			{
				System.out.println(t1+" "+t2+" "+t3+"inner");
				sum=sum+10;
			}
			}
			
		}
		System.out.println(sum);
	}

}
