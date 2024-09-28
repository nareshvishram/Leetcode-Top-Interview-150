class MedianFinder {
    //List<Integer> l;
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        //this.l=new ArrayList<>();
        this.minHeap=new PriorityQueue<>();
        this.maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        //l.add(num);
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if(minHeap.size()>maxHeap.size())
            maxHeap.offer(minHeap.poll());
    }
    
    public double findMedian() {
        // int n=l.size();
        // Collections.sort(l);
        // if(n%2==0)
        //     return (double)(l.get((n/2)-1)+l.get((n/2)))/2.0;
        // else
        //     return (double)l.get(n/2); 
        //System.out.println(minHeap.size()+" "+maxHeap.size()+" "+minHeap.peek()+" "+maxHeap.size());
        if(maxHeap.size()==minHeap.size())
            return (double)(maxHeap.peek()+minHeap.peek())/2.0;
        else
            return (double)maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */