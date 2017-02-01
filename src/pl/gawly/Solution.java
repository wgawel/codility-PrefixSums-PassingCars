package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        long pairs = 0;
        int sumEast = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                sumEast++;
            } else {
                pairs += sumEast;
                if (pairs > 1000000000) {
                    return -1;
                }
            }
        }
        return (int) pairs;
    }
}
