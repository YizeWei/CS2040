import java.util.*;
import java.lang.*;

public class fac_last_digit{
    
    public static int factorial(int i){
        int result=1;
        int j;
        for(j=1;j<=i;j++){
            result=result*j;
        }
    return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j;
        int []arr= new int[10];
        int len;
        for(j=0;j<i;j++){
            arr[j] = sc.nextInt();
        }
        len=arr.len();
  
        for(j=0;j<len;j++){
            arr[j]=factorial(arr[j]);
        }
        
        for(j=0;j<len;j++){
            System.out.println(arr[j]);
        }
    }
}