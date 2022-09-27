public static int distanceBetweenNodes(Node node, int d1, int d2){
    
    ArrayList<Integer>  firstL = nodeToRootPath(node,d1);
    ArrayList<Integer> secondL = nodeToRootPath(node,d2);   
      
    int ancestor = lca(node,d1,d2);

    int i = 0;
    int j = 0;
    while(firstL.get(i) != ancestor){

      i++;
    }

    while(secondL.get(j) != ancestor){

      j++;
    }

    return i+j;
  }