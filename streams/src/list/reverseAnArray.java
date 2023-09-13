package list;

import java.util.ArrayList;
import java.util.List;

//N = 5, K = 3
//arr[] = {1,2,3,4,5}
//Output: 3 2 1 5 4
//Explanation: First group consists of elements
//1, 2, 3. Second group consists of 4,5.

public class reverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		int k=3;
		List<Integer> revList=new ArrayList<>();
		List<Integer> tempList=new ArrayList<>();
		for(int i=0;i<li.size();i++)
		{
			int start=0;
			int end=start+3;
			
			for(int j=start;j<end;j++)
			{
				tempList.add(li.get(j));
			}
			System.out.println(tempList);
		}
		
		
	
	}

}
