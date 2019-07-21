import java.util.*;
import java.io.*;
import java.lang.*;
class MinEditDistance  {
    
    static int minEditDistance(char ch1[],char ch2[],int m, int n){
        
        int t[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
           t[i][0]=i;
        
        for(int j=0;j<=n;j++)
           t[0][j]=j;
           
        for(int i=1;i<=m;i++)
          for(int j=1;j<=n;j++){
              
              if(ch1[i-1]==ch2[j-1])
                 t[i][j]=t[i-1][j-1];
                 
              else 
              t[i][j]=1+min(t[i-1][j-1],t[i][j-1],t[i-1][j]);
              
              
              
              
          }
        
        return t[m][n];
        
         }
         
         
 static int min (int a, int b,int c){
      
      if (a>b)
      return Math.min(b,c);
      else
    return Math.min(a,c);
      
      
  }  
         
         
       
    
    

public static void main (String[] args) throws IOException{
    
   BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
   int t=Integer.parseInt(br.readLine());
   while(t-->0){
       
         int m=Integer.parseInt(br.readLine());
         
         String s1[]=br.readLine().trim().split("\\s+");
         char ch1[] = new char[m];
         for(int i=0;i<m;i++){
             
             ch1[i]=s1[i].charAt(0);
             
             
         }
         int n=Integer.parseInt(br.readLine());
         
         String s2[]=br.readLine().trim().split("\\s+");
         char ch2[] = new char[n];
         for(int i=0;i<n;i++){
             
             ch2[i]=s2[i].charAt(0);
             
             
         }
         System.out.println(minEditDistance(ch1,ch2,m,n));
    
   }
    
    
    
}
}
