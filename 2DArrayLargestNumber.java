
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
  
 
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int rows = inp.nextInt(), cols = inp.nextInt();
    int[][] arr = new int[rows][cols];
    for(int i=0 ;i<=rows-1;i++)
    {
      for(int j=0 ;j<=cols-1;j++)
      {
        arr[i][j]=inp.nextInt();
      }//end for cols
    }//end for rows
    
    
    //TODO write your code below
    
   
    
  int largest = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int idx = 0; idx < arr[i].length; idx++) {
				if (arr[i][idx] > largest) {
					largest = arr[i][idx];
				}
				
			}
		}
		System.out.println(largest);
    
		
    
   
  }//end main
}d