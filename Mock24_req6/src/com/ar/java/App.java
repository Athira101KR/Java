package com.ar.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of calls:");
		int noOfCall=sc.nextInt();
		List<Contact> contactList=Contact.prefill();
		
		
		for(int i=0;i<noOfCall;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] array=detail.split(",");
			Call call=new Call();
			call.setType(array[0]);
			call.setCallType(array[1]);
			call.setCost(Double.parseDouble(array[2]));
			SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
			call.setDuration(sdf.parse(array[3]));
			sdf=new SimpleDateFormat("dd/MM/yyyy");
			call.setDate(sdf.parse(array[4]));
			String contactName=array[5];
			
			for(Contact c:contactList)
			{
				if(c.getName().equals(contactName))
				{
					call.setContact(c);
					break;
				}
			}
			List<Call> callList=new ArrayList<>();
			callList.add(call);
			
			CallLog clog=new CallLog();
			clog.setCallList(callList);
			Contact contact=clog.getFavouriteContact();
			System.out.println("The favourite contact is "+contact.getName());
		}
	}

}
