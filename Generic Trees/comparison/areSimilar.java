public static boolean areSimilar(Node n1, Node n2) {
    // write your code here
    if(n1.children.size() != n2.children.size()){

      return false;
    }

    for(int i = 0; i < n1.children.size() ; i++){ //if number of children are same we can use same loop

      Node c1 = n1.children.get(i);
      Node c2 = n2.children.get(i);

      if(areSimilar(c1,c2) == false){ //faith

        return false;
      }
    }

    return true;
  }