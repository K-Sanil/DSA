import java.io.*;
import java.util.*;

public class Main{

   public static int[] nsr(int[] arr){
   
      int[] nsre = new int[arr.length];
      Arrays.fill(nsre, arr.length);

      Stack<Integer> stk = new Stack<>();

      for(int i = arr.length - 1; i >= 0 ; i--){

         while(stk.size() > 0 && arr[i] <= arr[stk.peek()]){
            stk.pop();
         }

         if(stk.size() > 0)
            nsre[i] = stk.peek();

         stk.push(i);
      }

      return nsre;
   }
  

  public static int[] nsl(int[] arr){

     int[] nsle = new int[arr.length];
     Arrays.fill(nsle, -1);

     Stack<Integer> stk = new Stack<>();

     for(int i = 0; i <= arr.length - 1; i++){

        while(stk.size() > 0 && arr[i] <= arr[stk.peek()]){
           stk.pop();
        }

        if(stk.size() > 0)
         nsle[i] = stk.peek();


       stk.push(i);
     }

     return nsle;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    int[] nsl = nsl(arr);
    int[] nsr = nsr(arr);

    int maxArea = 0;

    for(int i=0; i<arr.length; i++){

       int currArea = (nsr[i] - nsl[i] - 1) * arr[i];
       maxArea = Math.max(maxArea , currArea);
    }

    System.out.println(maxArea);

 }
}