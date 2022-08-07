public static void levelZigZag(Node root){

	Queue<Node> queue = new ArrayDeque<Node>();
	Queue<Node> cQueue = new ArrayDeque<Node>();

	Stack<Node> stack = new Stack<Node>();
	Stack<Node> cStack = new Stack<Node>();

	queue.add(root);

	int c = 0;
    
		while(queue.size() > 0 || stack.size() > 0){

		if(c%2==0){
		
		Node temp = queue.remove();
		System.out.println(temp.data + " ");

		for(Node child: temp.children){
			
			cStack.push(child);

		}

		if(queue.size() == 0){

			stack = cStack;
			cStack = new Stack<Node>();
			System.out.println(".");
			c++;
			}

		}

		else{

			Node temp = stack.pop();
			System.out.println(temp.data + " ");

			for(Node child: temp.children){
			
				cQueue.push(child);

			}

			if(stack.size() == 0){

			queue = cQueue;
			cQueue = new ArrayDeque<Node>();
			System.out.println(".");
			c++
			}
		}
	}
}