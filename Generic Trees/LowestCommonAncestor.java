public static int lca(Node node, int d1, int d2) {
    ArrayList<Integer> firstL = new ArrayList<Integer>();
    ArrayList<Integer> secondL = new ArrayList<Integer>();

    firstL = nodeToRootPath(node,d1);
    secondL = nodeToRootPath(node,d2);

    int i = firstL.size() - 1;
    int j = secondL.size() - 1;

    while(firstL.get(i) == secondL.get(j)){

        

        if(i == 0){
          return firstL.get(i);
        }

        if(j==0){
          return secondL.get(j);
        } 

        i--;
        j--;
    }

    return firstL.get(i + 1);

  }