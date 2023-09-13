package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Pattern.matches("[amn]?", "amnn"));
		Scanner sc=new Scanner(System.in);
		
		System.out.println("entr a pattern:");
		Pattern pattern=Pattern.compile(sc.nextLine());
		System.out.println("enter the sentence:");
		Matcher matcher=pattern.matcher(sc.nextLine()) ;
		boolean found=false;
		while(matcher.find())
		{
			System.out.println("found the text "+matcher.group()+" at "+matcher.start()+" and "+matcher.end());
			found=true;
		}
		if(!found)
		{
			System.out.println("not found");
		}
	}

}


