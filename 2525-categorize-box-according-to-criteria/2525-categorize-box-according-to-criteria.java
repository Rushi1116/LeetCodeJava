class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        return (new String[] {"Neither", "Bulky", "Heavy", "Both"})[
                        ((length >= 10_000 || width >= 10_000 || height >= 10_000 || 
                                (long)length * height * width >= 1_000_000_000L) ? 1 : 0) + 
                        ((mass >= 100) ? 2 : 0)];
    }
}