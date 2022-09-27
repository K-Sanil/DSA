public static void main(String[] args) throws Exception {
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    printIncreasing(n);
}

public static void printIncreasing(int n){
    
    if(n>1) printIncreasing(n-1);

    System.out.println(n);
    

}