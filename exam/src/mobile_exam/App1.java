package mobile_exam;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Mobile Brand:");
		String name=sc.nextLine();
		MobileBO mb=new MobileBO();
		//mb.setName(name);
		int choice=-1;
		do
		{
			System.out.println("1.Add Mobile\r\n" + 
					"2.Delete Mobile\r\n" + 
					"3.Display Mobiles\r\n" + 
					"4.Exit\r\n" + 
					"Enter your choice:\r\n" + 
					"");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:		//add
				String detail=sc.nextLine();
				if(detail.equals(""))
					detail=sc.nextLine();
			//	Mobile mobile=Mobile.createMobile(detail);
				//mb.addMobileToMobileBrand(mobile);
			//	System.out.println("Mobile successfully added");
				break;
			case 2:		//delete
				System.out.println("Enter the mobile name:");
				String mobName=sc.nextLine();
				if(mobName.equals(""))
					name=sc.nextLine();
//				Boolean status = mb.removeMobileFromMobileBrand(referenceId);
//				if(status)
//				{
//					System.out.println("Mobile successfully deleted");
//				}else
//				{
//					System.out.println("Mobile not found in the Mobile Brand");
//				}
			//	mb.findMobile(mobile, mobName);
				break;
			case 3:		//display
			//	System.out.println("Mobiles in "+mb.getName());
			//	mb.displayMobiles();
				break;
				
			}
		}while(choice<4);
	}

}
