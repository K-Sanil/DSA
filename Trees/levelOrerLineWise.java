import java.util.ArrayDeque;
import java.util.Queue;

import com.sun.org.apache.bcel.internal.classfile.Node;

public class levelOrerLineWise {
    Queue<Node> queue = new ArrayDeque<>();
    Queue<Node> cQueue = new ArrayDeque<>();

    queue.add(root);

    while(queue.size() > 0){


        Node temp = queue.remove();
        System.out.println(temp.data + " ");
        for(Node child: temp.children){
            cQueue.add(child);
        }

        if(queue.size() == 0){

            queue = cQueue;
            cQueue = new ArrayDeque<>();
            System.out.println(".");
        }
    }
}
