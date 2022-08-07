public static Node construct {

    Stack<Node> stk = new Stack<>();
    Node root = null;

    for(int val: arr){

        if(val == -1){

            Node temp = stk.pop();

            //the popped element will be made children of the TOP element

            if(stack.size() > 0){

                Node parent = stack.peek();
                parent.children.add(node);
            } else{

                root = node;
            }

        }


        Node node = new Node(val)
        stk.push(node);

    }

    return root;
    
}

public static void main(String[] args){

    int[] arr = [10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1];

    Node root = construct(arr);
    levelOrerLineWise(root);

}
 