import java.util.Scanner;

public class zoho {

	public static void main(String[] args) {
		//int n=7,arr[]= {0,2,1,2,0,0,1};
		//int n=9,arr[]= {2,1,0,1,0,1,0,2,1};
		
		int n=0;
		Scanner ss=new Scanner(System.in);
		n=ss.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ss.nextInt();
		}
		int t=0;
		int j=0;
		for(int i=0;i<n;i++)
		{
			
				if(arr[i]<arr[j])
				{
				 t=arr[i];
				 arr[i]=arr[j];
				 arr[j]=t;
				}
				if(j<n-1)
				{
					i--;
				}
				j++;
				if(j==n)
				{
					j=0;
				}
				
			
		}
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print(arr[i]);
			
		}
		
	}

}
