package edureka;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class SmapleException
{
	static void convertDate(String inputDate)
	{
		try {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date date=sdf.parse(inputDate);
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");
		String date2=sdf2.format(date);	
		System.out.println("new date"+date2);
		}
		catch(java.text.ParseException e){
			System.out.println("some erroe occyred");
		}
	}
}

public class dateFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmapleException s=new SmapleException();
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		s.convertDate(date);

	}

}
