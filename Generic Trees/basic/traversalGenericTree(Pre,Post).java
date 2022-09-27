
  public static void traversals(Node node){
    //Node pre 
    System.out.println("Node Pre " + node.data);

    //loop to get children, and for Edge Pre and Post

    for(Node child: node.children){

      System.out.println("Edge Pre " + node.data + "--" + child.data);
      traversals(child);
      System.out.println("Edge Post " + node.data + "--" + child.data);
    }

    //Node Post
    System.out.println("Node Post " + node.data);
  }
