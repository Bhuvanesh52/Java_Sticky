import java.util.HashMap;
import java.util.Map;

public class find_str_matrix {
	static String Str_matrix[]= {"azol","nxho","vyiv","orse"};
	static String dis[]={"zoho","van","love","are","is","az"};
	static int inc=0;
	static boolean iter(int row,int col,String dis,char nav)
	{
		if(row<0 || col<0 || row>=Str_matrix.length || col>=Str_matrix.length)
		{
			return true;
		}
		if(inc==dis.length())
		{
			return false;
		}	
		else
		if(Str_matrix[row].charAt(col)==dis.charAt(inc))
		{
			inc++;
			if(nav!='S')
			{
			iter(row-1,col,dis,'N');
			}
			if(nav!='N')
			{
			iter(row+1,col,dis,'S');
			}
			if(nav!='E')
			{
			iter(row,col+1,dis,'W');
			}
			if(nav!='W')
			{
			iter(row,col-1,dis,'E');
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int row=0,col=0;
		for(int i=0;i<Str_matrix.length;i++)
		{
			for(int j=0;j<Str_matrix[0].length();j++)
			{
				for(int i1=0;i1<dis.length;i1++)
				{
					if(Str_matrix[i].charAt(j)==dis[i1].charAt(0))
					{
						iter(i,j,dis[i1],'_');
						if(inc==dis[i1].length())
						{
							System.out.println(dis[i1]);
						}
						inc=0;
					}
				}
				
			}
		}
		
	}

}
