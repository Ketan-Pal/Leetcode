class Solution {
    public String makeGood(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){

            // using stack to compare immediate/Adjacent elements

            if(!st.isEmpty() && Math.abs(c-st.peek())==32){
                st.pop();//ommits both elements
            }
            else{
                st.push(c);
            }
        }
        /* 
        if we add normally then the string would be in reversed order because of stack
        thats why we insert each element at 0th index
        */
        while(!st.isEmpty()){
            sb.insert(0,st.pop()); 
        }

        return sb.toString();
    }
}