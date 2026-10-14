
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < sum / 9; i++) {
            ans.append('9');
        }

        int rem = sum % 9;
        if (rem != 0) {
            ans.append((char)(rem + '0'));
        }

        int remLen = num - ans.length();

        for (int i = 0; i < remLen; i++) {
            ans.append('0');
        }

        return ans.toString();
    }
}
