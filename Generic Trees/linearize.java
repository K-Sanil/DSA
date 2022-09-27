//O(n2)


public static Node getTail(Node node){

    while(node.children.size() > 0){

      node = node.children.get(0);
    } //will take the node value to the leaf

    return node;
  }

  public static void linearize(Node node){
    
    for(Node child: node.children){
      linearize(child);
    }

    while(node.children.size() > 1){

      Node last = node.children.remove(node.children.size() - 1); // removing last child
      Node sLast = node.children.get(node.children.size() - 1); //getting second last child

      Node sLastTail = getTail(sLast); //getting tail of second last child

      sLastTail.children.add(last); //adding Last child as child of the tail of second last child
    }
  }