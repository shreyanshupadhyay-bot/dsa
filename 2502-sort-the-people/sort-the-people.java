class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int m =  heights.length;
        String arr[] = new String[n];
        boolean sw;
        for(int i =0;i<n;i++){
            sw=false;
            for(int j=1;j<n-i;j++){
                if(heights[j]>heights[j-1]){
                    int temp =heights[j-1];
                    heights[j-1]=heights[j];
                    heights[j]=temp;
                    sw=true;
                    String kemp =names[j-1];
                    names[j-1]=names[j];
                    names[j]=kemp;

                }
                
            }
            if(!sw){
                break;
            }
         
        }
        return names;
        
    }

}