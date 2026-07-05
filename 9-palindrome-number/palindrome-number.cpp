class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) return false; // negative numbers can't be palindromes

        int original = x;
        long long reversed = 0; // use long long to avoid overflow

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
};
