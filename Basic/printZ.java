import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your code here

        for(int i=0;i<5;i++){

            if(i==0 || i==4){
                System.out.println("*****");
            }
            else{
                for(int j=4-i;j>0;j--){
                    System.out.print(" ");
                }

                System.out.println("*");
            
           }

        }
    }
}