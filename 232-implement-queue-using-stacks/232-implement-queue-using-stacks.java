class MyQueue {

    ArrayList<Integer> arr = new ArrayList<Integer>();

    public MyQueue() {
    }

    public void push(int x) {
        this.arr.add(x);
    }

    public int pop() {
        int tmp = this.arr.get(0);
        this.arr.remove(0);
        return tmp;
    }

    public int peek() {
        return this.arr.get(0);
    }

    public boolean empty() {
        if (this.arr.size() == 0) return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */