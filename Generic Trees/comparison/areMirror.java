public static boolean areMirror(Node n1, Node n2) {
    // write your code here
    if(n1.children.size() != n2.children.size()){

      return false;
    }

    for(int i = 0; i<(n1.children.size())/2 ; i++){ //need to check only half 

      Node c1 = n1.children.get(i);
      Node c2 = n2.children.get(n1.children.size() - 1 - i); //as its mirror the opposite ends should be similar

      if(areMirror(c1,c2) == false){

        return false;
      }
    }

    return true;
  }