class BrowserHistory {
    Deque<String>curr;
    Deque<String>forw;


    public BrowserHistory(String homepage) {
        curr=new ArrayDeque<>();
        forw=new ArrayDeque<>();
        curr.push(homepage);
        
    }
    
    public void visit(String url) {
        curr.push(url);
        while(!forw.isEmpty()){
            

            forw.pop();
          
        }
        
    }
    
    public String back(int steps) {
        while(steps-->0){
            if(curr.size()>1){
             String op=curr.pop();
        forw.push(op);
            }
            else{
                break;
            }
        }
        return curr.peek();
       
        
    }
    
    public String forward(int steps) {
        
        while(steps-->0){
            if(forw.size()>0){
                String hello=forw.pop();
                curr.push(hello);
            }
            else{
                break;
            }
        }
return curr.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */