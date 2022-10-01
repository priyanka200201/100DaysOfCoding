class Solution {
    public boolean isPalindrome(int x) {
         int rev = 0;
        int rem;
        int num=x;
        
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        
        if (x == rev)
            return true;
        else
            return false;
    }
}