
  public static void levelOrderLinewiseZZ(Node node){
    
    LinkedList<Node> que = new LinkedList<>();
    LinkedList<Node> st = new LinkedList<>();

    que.addLast(node);
    int level = 0;

    while(que.size() != 0){
      int currSize = que.size();

      while(currSize-- >0){
        Node rNode = que.removeFirst();
        System.out.print(rNode.data + " ");

      if(level%2 == 0){

        for(int i = 0; i < rNode.children.size(); i++)
          st.addFirst(rNode.children.get(i));
        }
      else{
        for(int i = rNode.children.size() - 1; i >= 0; i--)
          st.addFirst(rNode.children.get(i));
        }
      }

      level++;
      System.out.println();

      LinkedList<Node> temp = que;
      que = st;
      st = temp;
    }


  }
