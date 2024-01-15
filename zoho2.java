import java.util.Scanner;

public class zoho2 {

	public static boolean check(int n)
	{
		while(n!=0)
		{
			int k=n%10;
			if(k==3 || k==4)
			{
				return true;
			}
			n/=10;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int num=0,sum_up=0;
		int n=0,i=0;
		Scanner ss=new Scanner(System.in);
		n=ss.nextInt();
		boolean flag;
		while(i<n)
		{
			flag=check(num);
			if(flag)
			{
				sum_up+=num;
				i++;
			}
			num++;
		}
		System.out.println(num-1);
		System.out.println(sum_up);

	}

}
