/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int minAttempts(int[]x,int[]y,int eggs, int floors){
        
        int t[][]=new int[eggs+1][floors+1];
        for(int i=1;i<=eggs;i++)
          for(int j=1;j<=floors;j++){
              
              if(i==1)
                t[i][j]=j;
                
              else if(j==1)
                 t[i][j]=1;
               
              else
              {
                int p=100000;
                 for(int k=i;k<j;k++)
                 p=Math.min(p,1+Math.max(t[i-1][k-1],t[i][j-k]));
                 
                  t[i][j]=p;
              
                  
              }
             
          }
          
          return t[eggs][floors];
        
    }
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int floors=Integer.parseInt(br.readLine());
		int eggs=Integer.parseInt(br.readLine());
		int y[]=new int[floors];
		for(int j=0;j<floors;j++)
		   y[j]=j;
		int x[]=new int[eggs];
		for(int i=0;i<eggs;i++)
		   y[i]=i;
		System.out.println(minAttempts(x,y,eggs,floors));
	}
}
