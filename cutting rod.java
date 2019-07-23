/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    static int maxProfit(int[]lengths,int[]value,int rodlength){
        
        int n=value.length;
        int m=rodlength;
        int t[][]=new int[n][m+1];
        
              
      
       
       for(int i=0;i<=m;i++){
           
           
           if(i<lengths[0])
           t[0][i]=0;
          
           else{
               
               if(t[0][i-lengths[0]]!=0)
               t[0][i]=value[0]+t[0][i-lengths[0]];
               else
               t[0][i]=0;
           }
       }
       
       for(int i=1;i<n;i++)
         for(int j=0;j<=m;j++){
             if(j<lengths[i]){
                 
                 t[i][j]=t[i-1][j];
                 
                 
             }
             else {
                 
              
               t[i][j]=Math.max(t[i-1][j],value[i]+t[i][j-lengths[i]]);
    
                 
                 
                 
             }
                 
             
         }
        
        
        
        
      return t[n-1][m-1];  
        
    }
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int lengths[]={1,3,4,5,7,3};
	int value[]={2,5,7,9,6,8};
	int rodlength=Integer.parseInt(br.readLine());
	System.out.println(maxProfit(lengths,value,rodlength));
	}
}
