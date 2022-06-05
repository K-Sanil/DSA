import java.util.*;
  
  public class Main{

    public static String isPrime(int d){

      for(int i=2; i*i <= d; i++){
        if(d%i==0){
          return "not prime";
        }
      }
        return "prime";
    }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       int n = scn.nextInt();

       for(int i=0;i<n;i++){
          int t = scn.nextInt();
          System.out.println(isPrime(t));

       }
  
   }
  }