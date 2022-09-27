public static void main(String[] args) throws Exception {
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    printDecreasing(n);
}

public static void printDecreasing(int n){

    System.out.println(n);

    if(n>1) printDecreasing(n-1);

    return;
}