import java.io.*;
import java.util.*;

public class Main{

public static int precedence(char op){

    if(op == '+' || op == '-') return 1;
    if(op == '/' || op == '*') return 2;

    return 0;
}

public static int performOp(int a, char op, int b){

    if(op == '+'){
        return a+b;
    }

    if(op == '-'){
        return a-b;
    }

    if(op == '/'){
        return a/b;
    }
    else{
        return a*b;
    }
   
}
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code 

    Stack<Character> operator = new Stack<>();
    Stack<Integer> operand = new Stack<>();

    for(int i=0; i<exp.length(); i++){

        char ch = exp.charAt(i);

        if(ch>='0' && ch<='9'){

            //push into operand stack

            operand.push(ch - '0'); //to convert character into integer
        }
        else{

            if(ch == '('){
                operator.push(ch);
            }

            else if(ch == ')'){

                while(operator.peek() != '('){
                    int b = operand.pop();
                    int a = operand.pop();
                    char op = operator.pop();

                    operand.push(performOp(a,op,b));
                }

                operator.pop(); //get rid of (
            }

            else if(ch == '+' || ch == '-' || ch == '/' || ch == '*'){

                while(operator.size() > 0 && operator.peek() != '(' && precedence(operator.peek()) >= precedence(ch)){

                    int b = operand.pop();
                    int a = operand.pop();
                    char op = operator.pop();

                    operand.push(performOp(a,op,b));
                    
                }

                operator.push(ch); //if precedence is lower
            }
        }
    }
     

    while(operator.size() > 0){

        int b = operand.pop();
        int a = operand.pop();
        char op = operator.pop();

        operand.push(performOp(a,op,b));
        
    }

    System.out.println(operand.peek());

    
 }
}