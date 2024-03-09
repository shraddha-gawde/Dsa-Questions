class RecentCounter {
    LinkedList<Integer> swin;
    public RecentCounter() {
        swin = new LinkedList<>();
    }
    public int ping(int t) {
        swin.addLast(t);
        while(swin.getFirst() < t - 3000){
            
            swin.removeFirst();
        } 
        return swin.size();
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */