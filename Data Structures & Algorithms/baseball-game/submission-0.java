class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String op : operations){
            switch(op){
                case "+":
                    int last = stack.pop();
                    int secondlast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondlast);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                   stack.push(Integer.parseInt(op));     
            }
        }
            int sum = 0;
            while(!stack.isEmpty()){
                sum += stack.pop();
        }
        return sum;
    }
}