class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        long totalShift = 0;
        
        for (int i = shifts.length - 1; i >= 0; i--) {
            totalShift += shifts[i];
            int currentShift = (int) (totalShift % 26);
            chars[i] = (char) (((chars[i] - 'a' + currentShift) % 26) + 'a');
        }
        
        return new String(chars);
    }
}
