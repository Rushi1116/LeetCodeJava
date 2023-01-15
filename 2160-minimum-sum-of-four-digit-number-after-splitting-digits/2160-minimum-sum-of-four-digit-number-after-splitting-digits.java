class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int i=0;
        while(i<=3)
        {
            digits[i++] = num%10;
            num/=10;
        }
        Arrays.sort(digits);
        // digits[0] at ten's place and digits[2] at one's place makes the first number
        // digits[1] at ten's place and digits[3] at one's place makes the second number
        return digits[0]*10+digits[2]+digits[1]*10+digits[3];
    }
}