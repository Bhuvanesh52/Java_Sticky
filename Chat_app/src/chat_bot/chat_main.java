package chat_bot;

import java.util.Scanner;

public class chat_main {

	public static void main(String[] args) {
		Scanner get_by_user=new Scanner(System.in);
		int User_Option=0;
		String Enter_mobileNum,Enter_UserName;
		while(User_Option!=3)
		{
			System.out.println("1.Login\n2.SignUp\n3.Exit");
			User_Option=get_by_user.nextInt();
			get_by_user.nextLine();
			switch(User_Option)
			{
			case 1://Login
				System.out.println("UserName :");
				Enter_UserName=get_by_user.nextLine();
				System.out.println("MobileNumber");
				Enter_mobileNum=get_by_user.nextLine();
				Login(Enter_UserName,Enter_mobileNum);
				break;
			case 2://SignUp
				System.out.println("UserName :");
				Enter_UserName=get_by_user.nextLine();
				System.out.println("MobileNumber");
				Enter_mobileNum=get_by_user.nextLine();
				SignUp(Enter_UserName,Enter_mobileNum);
				break;
			}
		}
		System.out.println("Exit..");

	}
	private static MainFrame Main_Frame_check(String UserName,String MobileNumber)
	{
		MainFrame Main_frame=new MainFrame();
		if(Main_frame.DataBase.size()==0)
		{
			return Main_frame;
		}else{
			for(Database DB_Check:Main_frame.DataBase)
			{
				if(DB_Check.get_MobileNumber().equals(MobileNumber))
				{
					return null;
				}
			}
			return Main_frame;
		}		
	}
	
	private static Database Main_Frame_check_Login(String UserName,String MobileNumber)
	{
		MainFrame Main_frame=new MainFrame();
		if(Main_frame.DataBase.size()==0)
		{
			return null;
		}else{
			for(Database DB_Check:Main_frame.DataBase)
			{
				if(DB_Check.get_MobileNumber().equals(MobileNumber) && DB_Check.get_UserName().equals(UserName))
				{
					return DB_Check;
				}
			}
			return null;
		}
	}
	
	private static void Login(String UserName,String MobileNumber)
	{
		
		Database DB=Main_Frame_check_Login(UserName,MobileNumber);
		if(DB!=null)
		{
			//Send a Msg by Here
		}else {
			System.out.println("Check username & Password");
		}
		
		
	}
	private static void SignUp(String UserName,String MobileNumber)
	{
		MainFrame MF=Main_Frame_check(UserName,MobileNumber);
		if(MF!=null)
		{
			MF.DataBase.add(new Database(UserName,MobileNumber));
		}else {
			System.out.println("Mobile_Number Already Exist");
		}
	}

	
	
}
