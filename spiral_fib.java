package main;

public class tryone {
	static int r=3,c=3;
	static int fib[]=new int[r*c];
	static int to_store[][]=new int[r][c];
	static int row_f=0,col_f=0,row_b=r-1,col_b=c-1;
	static int inc=0;
	static int right()
	{
		for(int i=col_f;i<=col_b;i++)
		{
			to_store[row_f][i]=fib[inc++];
		}row_f++;
		return 1;
	}
	static int down()
	{
		for(int i=row_f;i<=row_b;i++)
		{
			to_store[i][col_b]=fib[inc++];
		}col_b--;
		return 2;
	}
	static int left()
	{
		for(int i=col_b;i>=col_f;i--)
		{
			to_store[row_b][i]=fib[inc++];
		}row_b--;
		return 3;
	}
	static int up()
	{
		for(int i=row_b;i>=row_f;i--)
		{
			to_store[i][col_f]=fib[inc++];
		}col_f++;
		return 0;
	}
	
	public static void main(String[] args) {
		
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<r*c;i++)
		{
			fib[i]=fib[i-2]+fib[i-1];
		}
		int entry=0;
		while(inc<r*c)//2->3,3->5,4->7,5->9
		{
			switch(entry)
			{
			case 0://right
				entry=right();
				break;
			case 1://down
				entry=down();
				break;
			case 2://left
				entry=left();
				break;
			case 3://up
				entry=up();
				break;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(to_store[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
