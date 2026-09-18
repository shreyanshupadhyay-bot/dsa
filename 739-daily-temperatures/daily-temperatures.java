class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();
    // int ind=0;
        int arr[] =new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                int ind =st.pop();
                arr[ind] =  i-ind;
            }
                st.push(i);
        }
        return arr;
        

    }
}