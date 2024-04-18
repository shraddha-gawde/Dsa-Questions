class StockSpanner {
    List<Integer> l;
    public StockSpanner() {
        l=new ArrayList<>();
    }
    
    public int next(int price) {
        l.add(price);
        int c=0;
       for(int i=l.size()-1;i>=0;i--)
        {
            if(l.get(i)<=price){c++;}
            else break;
        }
        return c;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */