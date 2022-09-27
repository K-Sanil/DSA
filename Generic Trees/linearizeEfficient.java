//O(n)

public static Node linearizeEfficient(Node node) {

    if(node.children.size() == 0){

        return node;
    }

    Node lastChild = node.children.get(node.children.size() - 1);
    Node lastChildTail = linearizeEfficient(lastChild); //Faith of this recursion fixes or linearizes the elements below 

    while(node.children.size() > 1){

        Node sLastChild = node.children.get(node.children.size() - 2);
        Node sLastChildTail = linearizeEfficient(sLastChild);

        sLastChildTail.children.add(lastChild);

        node.children.remove(node.children.size() - 1);

        lastChild = sLastChild;
    }

    return lastChildTail;
    
}
