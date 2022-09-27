public static void serialize(Node node, ArrayList<Integer> list){


    //NODE PRE
    list.add(node.data);


    //EDGE TRAVERSAL
    for(Node child: node.children){
        serialize(child, list);
    }

    //NODE POST
    list.add(-1);
}