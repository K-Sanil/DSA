public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    
    ArrayList<Integer> NtR = new ArrayList<>();

    if(node.data == data){

        NtR.add(node.data);
        return NtR;
      }

    for(Node child : node.children){

      NtR = nodeToRootPath(child, data);

      if(NtR.size() != 0){

        NtR.add(node.data);
        return NtR;
      }
    }

    return NtR;
 }