
  public static int size(Node node){
   
    int size = 0;

    for(Node child : node.children){

      size += size(child);
    }

    return size+1;
  }

 