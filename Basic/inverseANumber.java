import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int inv = 0;
  int op = 1;

  int n = scn.nextInt();

  while(n!=0){

    int ip = n%10;
    int id = op;

    inv = inv + id * (int)Math.pow(10,ip - 1);

    op++;
    n = n/10;
  }

  System.out.println(inv);

 }
}