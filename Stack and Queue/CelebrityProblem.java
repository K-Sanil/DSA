import java.io.*;
import java.util.*;

public class Main {

      public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
    }

    public static void findCelebrity(int[][] arr) {
        
        Stack<Integer> clb = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            clb.push(i);
        }

        while(clb.size() > 1){

            int i = clb.pop();
            int j = clb.pop();

            if(arr[i][j] == 1){

                //x knows y -> x cant be a celebrity
                clb.push(j); //may or may not be celeb
            } 
            if(arr[i][j] == 0){

                // x doesnt know y -> y cant be a celebrity
                clb.push(i); //may or may not be celeb
            }
        }


        //last confirmation 
        int last = clb.pop();
        boolean flag = true;

        for(int i = 0; i < arr.length ; i++){

            if(i != last){ //arr[i][i] will be 0 always no need to check 
            
                if(arr[last][i] == 1 || arr[i][last] == 0){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println(last);
        } else{
            System.out.println("none");
        }
    }

}