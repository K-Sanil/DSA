for(int i=0; i<x.length(); i++){

    if(Y == x.charAt(i)){

        dist.add(i);
    }

    if(dist.size() <= 1) return -1;

    int distance = dist.get(dist.size() - 1) - dist.get(0);

    return distance;
}
