import java.io.*;
import java.util.*;

public class Main{


public static int performOp(int a, int b, char op){


    if(op == '+'){
         return(a + b);
    } else if(op == '-'){
        return(a - b);
    } else if(op == '*'){
        return(a * b);
    } else{
        return(a / b);
    }

}
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    Stack<String> prefix = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<Integer> eval = new Stack<>();

    for(int i=0;i<exp.length();i++){

        char ch = exp.charAt(i);

        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){

            int b = eval.pop();
            int a = eval.pop();

            int val = performOp(a,b,ch);
            eval.push(val);

            String infB = infix.pop();
            String infA = infix.pop();

            String inf = "(" + infA + ch + infB + ")";
            infix.push(inf);

            String preB = prefix.pop();
            String preA = prefix.pop();

            String pre = ch + preA + preB;
            prefix.push(pre);
        } else{
            eval.push(ch - '0');
            infix.push(ch + "");
            prefix.push(ch + "");
        }
    }

    System.out.println(eval.peek());
    System.out.println(infix.peek());
    System.out.println(prefix.peek());
 }
}