import java.io.*;
import java.util.*;

public class Main {

  public static class MinStack {
    Stack<Integer> data;
    int min;

    public MinStack() {
      data = new Stack<>();
      min = Integer.MAX_VALUE;
    }

    int size() {
      return data.size();
    }

    void push(int val) {
      
      if(val > min){
        data.push(val);

      }
      else{

        int currMin = val;
        int encoded = 2 * currMin - min; ///Encoding  
        min = currMin;

        data.push(encoded);
      }

    }

    int pop() {
      
      if(size() == 0){

        System.out.println("Stack underflow");
        return -1;

      }

      int val = data.pop();

      if(val >= min){

        return val;
      }

      //If any value in stack is less than the current minimum then its the encoded value

      //decoding the encoded values 
      int actualVal = min;
      int prev = 2 * actualVal - val;
      min = prev;

      return actualVal;
    }

    int top() {
      
      if(size() == 0){

        System.out.println("Stack underflow");
        return -1;

      }

      if(data.peek() >= min){

        return data.peek();
      }

      return min;
    }

    int min() {

      if(size() == 0){

        System.out.println("Stack underflow");
        return -1;

      }
  
      return min;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if (str.startsWith("pop")) {
        int val = st.pop();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top")) {
        int val = st.top();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(st.size());
      } else if (str.startsWith("min")) {
        int val = st.min();
        if (val != -1) {
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}