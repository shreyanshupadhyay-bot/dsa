class Solution {
    static final long mod =1000000007; 
    public int countGoodNumbers(long n) {
        long e = (n+1)/2;
        long o =n/2;
        long  ans =0;
        ans = power(5,e);
        ans =(ans*(power(4,o)))%mod;
        return (int)ans;
    }
    long power(long a,long b){
        if (b==0){
            return 1;
        }
        long half=power(a,b/2);
        long result =(half*half) %  mod;
        if(b%2==1){
            result=(result*a)%mod;
        }
        return result;
    }
}