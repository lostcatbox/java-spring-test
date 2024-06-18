package com.example.javacodetest.code;

import java.util.Arrays;

class Code1 {
    private final int[] emptyResult = new int[]{-1};

    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(target -> isRemainZero(target, divisor))
                .sorted().toArray();
        if (result.length < 1) {
            return emptyResult;
        }
        return result;
    }

    private boolean isRemainZero(int target, int divisor) {
        return target % divisor == 0;
    }
}