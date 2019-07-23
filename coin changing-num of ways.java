/*package whatever //do not write package name here */
import java.io.*;

class TotalWays{
    
    static int totalways(int coins[],int total){
        
       int n=coins.length;
       int m=total;
        int t[][]=new int[n][m+1];
    
        for(int i=0;i<n;i++)
           t[i][0]=1;
           
        for(int j=1;j<=m;j++){
            
            if(j<coins[0])
              t[0][j]=0;
              
            else if(j==coins[0])
                  t[0][j]=1;
            else{
                
                if(t[0][j-coins[0]]!=0)
               t[0][j]=t[0][j-coins[0]];
               else
               t[0][j]=0;
                     
            }
           
        }
        
       for(int i=1;i<n;i++)
         for(int j=1;j<=m;j++){
             if(j<coins[i]){
                 
                 t[i][j]=t[i-1][j];
                 
                 
             }
             else {
                 
              
               t[i][j]=t[i-1][j]+t[i][j-coins[i]];
          
             }
                 
             
         }
        
      return t[n-1][m];  
        
    }
	public static void main (String[] args) {
	 
	  int total = 5;
      int coins[] = {2,3,5};
      System.out.println("No of ways "+totalways(coins,total));
	 
	 
	}
}
