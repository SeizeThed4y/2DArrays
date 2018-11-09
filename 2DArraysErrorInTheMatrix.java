
import java.util.*;
class Main {
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int rows = inp.nextInt(), cols = inp.nextInt();
    String[][] arr = new String[rows][cols];
    for(int i=0 ;i<=rows-1;i++)
    {
      for(int j=0 ;j<=cols-1;j++)
      {
        arr[i][j]=inp.next();
      }//end for cols
    }//end for rwos
    
    
 for (int i = 0; i < arr.length; i++){
      for(int idx = 0; idx < arr[i].length; idx++){
        if(idx % 2 == 0){
          arr[i][idx] = "0";
        }else{
          arr[i][idx] = "1";
        }
      }
    }
    
  
    System.out.println( Arrays.deepToString(arr) ) ;
  }//end main
}