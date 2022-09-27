

//   public class levelOrerLineWise {         with 2 queues 
//     Queue<Node> queue = new ArrayDeque<>();
//     Queue<Node> cQueue = new ArrayDeque<>();

//     queue.add(root);

//     while(queue.size() > 0){


//         Node temp = queue.remove();
//         System.out.println(temp.data + " ");
//         for(Node child: temp.children){
//             cQueue.add(child);
//         }

//         if(queue.size() == 0){

//             queue = cQueue;
//             cQueue = new ArrayDeque<>();
//             System.out.println(".");
//         }
//     }
// } 
  public static void levelOrder(Node node){   //with One linked list 
    

    LinkedList<Node> que = new LinkedList<>();
    que.addLast(node);

    while(que.size() != 0){

      int currSize = que.size();

      while(currSize-- > 0){

        Node rNode = que.removeFirst();
        System.out.print(rNode.data + " ");

        for(Node child: rNode.children){
          que.addLast(child);
        }
      }
    }
    System.out.print(".");
  }
