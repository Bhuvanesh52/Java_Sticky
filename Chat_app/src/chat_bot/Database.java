package chat_bot;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
	private String UserName,MobileNumber;
	HashMap<String,HashMap<String,ArrayList<String>>> map=new HashMap<String,HashMap<String,ArrayList<String>>>();
	Database(String UserName,String MobileNumber)
	{
		this.UserName=UserName;
		this.MobileNumber=MobileNumber;
	}
	public String get_UserName()
	{
		return this.UserName;
	}
	public String get_MobileNumber()
	{
		return this.MobileNumber;
	}
}
