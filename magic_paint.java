package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
public class main {
	 
	 static int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
             {1, 1, 1, 1, 1, 1, 0, 0},
             {1, 0, 0, 1, 1, 0, 1, 1},
             {1, 2, 2, 2, 2, 0, 1, 0},
             {1, 1, 1, 2, 2, 0, 1, 0},
             {1, 1, 1, 2, 2, 2, 2, 0},
             {1, 1, 1, 1, 1, 2, 1, 1},
             {1, 1, 1, 1, 1, 2, 2, 1},
             };
	 static void paint(int x,int y,int color,int tochange)
	 {
		screen[x][y]=color;
		if((x-1>=0 && x-1<screen.length) && (y>=0 && y<screen[0].length) )
		{
			 if(screen[x-1][y]==tochange)
			 {
				 paint(x-1,y,color,tochange);
			 }
		}
		if((x+1>=0 && x+1<screen.length) && (y>=0 && y<screen[0].length) )
		{
			if(screen[x+1][y]==tochange)
			 {
				 paint(x+1,y,color,tochange);
			 }
		}
		if((x>=0 && x<screen.length) && (y-1>=0 && y-1<screen[0].length) )
		{
			if(screen[x][y-1]==tochange)
			 {
				 paint(x,y-1,color,tochange);
			 } 
		}
		if((x>=0 && x<screen.length) && (y+1>=0 && y+1<screen[0].length) )
		{
			if(screen[x][y+1]==tochange)
			 {
				 paint(x,y+1,color,tochange);
			 }
		}
	 }
	
	  public static void main(String[] args) {
		  int x = 1, y = 1, newColor = 3;
		  paint(x,y,newColor,screen[x][y]);
		 for(int i=0;i<screen.length;i++)
		 {
			 for(int j=0;j<screen[0].length;j++)
			 {
				 System.out.print(screen[i][j]+" ");
			 }
			 System.out.println();
		 }
	  }
	}
