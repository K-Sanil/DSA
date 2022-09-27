public class maxOfATree {

    public int max(Node node){

        int currMax = node.data;
        
        for(Node child: node.children){

            int recAns = max(child);
            currMax = Math.max(recAns,currMax);
        }

        return currMax;
    }
    
}
