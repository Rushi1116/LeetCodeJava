class Solution {
    static boolean solve(long two, int n){
        if(two>n) return false;
        else if(two==n) return true;
        return solve(two*2, n);
    }
    public boolean isPowerOfTwo(int n) {
      if(n==1) return true;
        return solve(2, n);
    }
   
}