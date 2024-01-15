import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zoho3 {
	public static List<Integer> arr=new ArrayList<Integer>();
	public static int count=0, end=0,start=0;
	public static int Check_Count(int start)
	{
		int sum=0;
		for(int i=start;i<arr.size();i++)
		{
			sum+=arr.get(i);
			if(sum>=count)
			{
				if(sum==count)
				{
					return i;
				}else {
					return i-1;
				}
				 
			}
		}
		return -1;
	}
	
	
	public static void Insert_Repeat()
	{
		
		while(end!=-1)
		{
		end=Check_Count(start);
		System.out.print("[");
		for(int l=start;l<=end;l++)
		{
			System.out.print(arr.get(l));
		}System.out.print("]");
		
		if(end==-1)
		{
			break;
		}
		start=end+1;
		}
		System.out.print("[");
		for(int l=start;l<arr.size();l++)
		{
			System.out.print(arr.get(l));
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		
		Scanner ss=new Scanner(System.in);
		int size_val=0,insert_d=0;
		
		count=ss.nextInt();
		size_val=ss.nextInt();
		for(int i=0;i<size_val;i++)
		{
			arr.add(ss.nextInt());
		}
		Insert_Repeat();
		while(true)
		{end=0;
		start=0;
			int inse=ss.nextInt();
			int ele=ss.nextInt();
		arr.add(inse-1,ele);
		Insert_Repeat();
		}
		
		
		
		}
	}


