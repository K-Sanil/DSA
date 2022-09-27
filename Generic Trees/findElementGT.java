public static boolean find(Node node, int data) {
    
    if(node.children.size() == 0){

      if(node.data == data) return true;
    }

    if(node.data == data) return true;

    for(Node child : node.children){

      boolean recAns = find(child,data);

      if(recAns) return true;

    }

    return false;
  }