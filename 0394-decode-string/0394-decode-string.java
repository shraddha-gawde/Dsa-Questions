class Solution {
    public String decodeString(String s) {
    int n = s.length();
    
    int num = 0;
    
    Stack<StringBuilder> sb = new Stack<>();
        
    Stack<Integer> times = new Stack<>();
    
    sb.push(new StringBuilder());
    
    for(int i=0;i<n;i++){
        char c = s.charAt(i);
        
        if(c=='['){
            times.push(num);
            sb.push(new StringBuilder());
            num =0;
        }
        else if(c==']'){
            int time = times.pop();
            String temp = sb.pop().toString();
            StringBuilder sbb = sb.peek();
            while(time-->0){
               sbb.append(temp); 
            } 
        }
        else if(Character.isDigit(c)){
            num = num * 10 + (c-'0');
        }
        else{
            sb.peek().append(c);
        }
    }
    
    return sb.peek().toString();
}
}