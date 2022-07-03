class MyCircularQueue {
    
    int[] arr;
    int front,rear,size;

    public MyCircularQueue(int k) {
        
        arr = new int[k];
         front = 0;
         rear = 0;
         size = 0;
         
    }
    
    public boolean enQueue(int value) {
        
        if(isFull()){

            return false;
        }

        arr[rear] = value;
        rear = (rear + 1) % arr.length;

        size++;
        return true;
        
    }
    
    public boolean deQueue() {
        
        if(size != 0){
            
            front = (front+1) % (arr.length);
            
            size--;
            return true;
        }
        
        return false;
    }
    
    public int Front() {
        
        if(isEmpty()) return -1;
        
        return arr[front];
        
    }
    
    public int Rear() {
        
        if(isEmpty()) return -1;
        
        return arr[(rear - 1 + arr.length) % arr.length];

        //-1 wagerah mein positive value hi return krega 
        //and update krte huye ek aage rakh dete rear ko isliye -1 se call 
        
    }
    
    public boolean isEmpty() {
        
        if(size == 0) return true;
        
        return false;
    }
    
    public boolean isFull() {
        
        if(size == arr.length) return true;
        
        return false;
        
    }
}
