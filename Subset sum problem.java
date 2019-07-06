import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  
    
     public static void find(int a[],int i,ArrayList<Integer> l,int n,int sum){
          
          if(sum<0)
          return;
         
         else if(sum==0){
             System.out.println(l);
             return;
        }
        else{
            
            for(int k=i;k<n;k++){
                
                l.add(a[k]);
                find(a,k+1,l,n,sum-a[k]);
                l.remove(l.size()-1);
                
                
            }
            
            
            
            
        }}
	public static void main (String[] args) throws IOException
	 {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  int t = Integer.parseInt(br.readLine()); 
  
        while (t-- > 0) { 
            ArrayList<Integer> l=new ArrayList<>();
            int sum =Integer.parseInt(br.readLine());
            // n : size of array 
            int n = Integer.parseInt(br.readLine()); 
  
            // Declaring array 
            int arr[] = new int[n]; 
  
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for (int i = 0; i < n; i++) 
            arr[i] = Integer.parseInt(strs[i]); 
            
            find(arr,0,l,n,sum);    
        
        }
	  
	  
	 }
}
