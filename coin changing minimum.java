import java.util.*;
import java.io.*;
import java.lang.*;
class MinCoins {
    
    static int minCoins(int total,int coins[]){
        int n =coins.length;
        int t[][]=new int[n][total+1];
       int max=10000;
       
       for(int i=0;i<=total;i++){
           
           
           if(i<coins[0])
           t[0][i]=max;
           else if(i==coins[0])
           t[0][i]=1;
           else{
               
               if(t[0][i-coins[0]]!=max)
               t[0][i]=1+t[0][i-coins[0]];
               else
               t[0][i]=max;
           }
       }
       
       for(int i=1;i<n;i++){
           for(int j=0;j<=total;j++){
               
               if(coins[i]>j)
               t[i][j]=t[i-1][j];
               else if(coins[i]==j)
               t[i][j]=1;
               else{
                  if(t[i][j-coins[i]]!=max){
                      
                      t[i][j]=Math.min(t[i-1][j],1+t[i][j-coins[i]]);
                  } 
                  else
                  t[i][j]=t[i-1][j];
               }
           }
       }
       
        return t[n-1][total];
    }
    
    

public static void main (String[] args){
    
    int coins[]={1,2,4,5,8};
    int total=10;
    System.out.println("minimum no of coins for "+total+" is "+minCoins(total,coins));//2
    
    
    
    
}
}
