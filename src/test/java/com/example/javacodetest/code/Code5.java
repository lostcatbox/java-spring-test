package com.example.javacodetest.code;

import java.util.Arrays;

class Code5 {

    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(com -> com + com).toArray();
    }

}