class Solution {
    public int subtractProductAndSum(int n) {
         int sum=0;
        int prod=1;
        while(n!=0)
        {
            int lastdigit=n%10;
            prod*=lastdigit;
            sum+=lastdigit;
            n=n/10;
        }
        int result=prod-sum;
        return result;
    }
}