public static boolean isMirror(Node n1, Node n2){

    if(n1.children.size() != n2.children.size()){

      return false;
    }

    int childSize = n1.children.size();

    for(int i = 0; i< childSize;i++){

      Node c1 = n1.children.get(i);
      Node c2 = n2.children.get(childSize - 1 - i);

      if(isMirror(c1,c2) == false) return false;
    }


    return true;
  }

  public static boolean IsSymmetric(Node node) {
    
    return isMirror(node,node); //if its symmetric it will be a perfect mirror image of itself!

  }
