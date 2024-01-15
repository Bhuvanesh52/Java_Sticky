package main;

public class punctuations_spaces {

	public static void main(String[] args) {
		String strr="house no : 123@ cbe";
		char str[]=strr.toCharArray();
		int init_num=0,end_num=str.length-1;
		while(init_num<end_num)
		{
			if(!((str[init_num]>='a' && str[init_num]<='z') || (str[init_num]<='9'&&str[init_num]>='0')))
			{
				init_num++;
				continue;
			}
			if(!((str[end_num]>='a' && str[end_num]<='z') || (str[end_num]<='9'&&str[end_num]>='0')))
			{
				end_num--;
				continue;
			}
			char t=str[init_num];
			str[init_num]=str[end_num];
			str[end_num]=t;
			init_num++;
			end_num--;
		}
		strr=String.valueOf(str);
		System.out.println(strr);

	}

}
