package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		 al.add(2);
	        al.add(6);
	        al.add(9);
	        al.add(4);
	        al.add(20);
	        
	        List<Integer> li=al.stream().filter(i->i%2==0)
	        		.collect(Collectors.toList());
	        System.out.println(li);
	}

}
