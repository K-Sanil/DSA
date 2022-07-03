class MyCircularDeque {
    
    int[] arr;
    int rear = 0;
    int front = 0;
    int size = 0;
 
    public MyCircularDeque(int k) {
        
        arr = new int[k];
        
    }
    
    public boolean insertFront(int value) {
        
        if(isEmpty()){  //adding at first base will move the rear cus rear always stays one element ahead of its actual posn
            arr[front] = value;
            size++;
            rear = (rear + 1) % arr.length;
            return true;
        }
        
        if(isFull()){
            
            return false;
        }
        
        front = ((front - 1) + arr.length) % arr.length; //"+ arr.length" to avoid negative values 
        arr[front] = value;
        size++;
        
        return true;
    }
    
    public boolean insertLast(int value) {
        
        
        if(isFull()){
            
            return false;
        }
        
        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
        
    }
    
    public boolean deleteFront() {
        
        if(isEmpty()){
            
            return false;
        }
        
        front = (front + 1) % arr.length;
        size--;
        return true;
        
    }
    
    public boolean deleteLast() {
        
        if(isEmpty()){
            
            return false;
        }
        
        rear = ((rear - 1)+arr.length) % arr.length; //"+ arr.length" to avoid negative values 
        size--;
        return true;
        
    }
    
    public int getFront() {
        
        if(isEmpty()){
            return -1;
        }
        
        return arr[front];
    }
    
    public int getRear() {
        
        if(isEmpty()){
            return -1;
        }
        
        return arr[((rear - 1)+arr.length) % arr.length ]; //"+ arr.length" to avoid negative values 
        
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