
public class zoho_try {

	public static void main(String[] args) {
		String str="Program";
		int y=0;
		for(int i=-(str.length()/2);i<=str.length()/2;i++,y++)
		{
			for(int j=-(str.length()/2);j<=str.length()/2;j++)
			{
				if(Math.abs(i) - Math.abs(j)==0)
				{
					System.out.print(str.charAt(y));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
