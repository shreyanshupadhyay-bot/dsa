class Solution {
    public String minWindow(String s, String t) {
        int left=0;
        int minl=Integer.MAX_VALUE;
        int freq[] = new int[128];
        int req=t.length();
        int sti=0;
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        } 
        for(int r=0;r<s.length();r++){
            char chr = s.charAt(r);
            if(freq[chr]>0){
                req--;
            }
            freq[chr]--;
            while(req==0){
                int winlen=r-left+1;
                if(winlen<minl){
                minl = winlen;
                sti = left;}

                char leftc=s.charAt(left);
                freq[(leftc)]++;
                if(freq[leftc]>0){
                    req++;
                }
                left++;
                
            }

        }
        if(minl == Integer.MAX_VALUE){
            return "";

        }
        return s.substring(sti,sti+minl);

    }
}