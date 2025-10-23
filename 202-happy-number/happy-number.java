class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        int current = n;
        while (current != 1 && !seen.contains(current)) {
            seen.add(current);
            current = getNext(current);
        }
        return current == 1;
    }
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n = n / 10;
        }
        return totalSum;
    }
}