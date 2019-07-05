import java.lang.*;
import java.io.*;
class GFG
 {  
     
     static int max(char input1[],char input2[],int n,int m){
         
         int a[][]=new int[n+1][m+1];
         
         for(int i=1;i<=n;i++){
             
             for(int j=1;j<=m;j++){
                 
                 //if weight is less than j
                 if(input1[i-1]==input2[j-1])
                 a[i][j]=a[i-1][j-1]+1;
                 // maximum of not considering currentweight ,considering current weight
                 else
                 a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
                 
             }
         }
         
         return a[n][m];
         
     }
	public static void main (String[] args) throws IOException
	 {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            // n : size of array 
            int n = Integer.parseInt(br.readLine()); 
            
  
            // Declaring array 
           
            
  
            // to read multiple integers line 
            String line[] = br.readLine().trim().split("\\s+"); 
            
            char input1[] = new char[n];
              
              for(int i=0;i<n;i++)
              input1[i]=line[i].charAt(0);
              
            int m=  Integer.parseInt(br.readLine()); 
        
            String x[] = br.readLine().trim().split("\\s+"); 
    
           char input2[]=new char[m];
           
             for(int i=0;i<m;i++)
               input2[i]=x[i].charAt(0);
              
          System.out.println(max(input1,input2,n,m));
        
        }
	  
	  
	 }
}
