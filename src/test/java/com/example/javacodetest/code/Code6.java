package com.example.javacodetest.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Code6 {

    public int[] solution(long n) {
        List<String> collect = Arrays.stream(Long.valueOf(n).toString().split("")).collect(Collectors.toList());
        Collections.reverse(collect);
        return collect.stream().mapToInt(com -> Integer.valueOf(com)).toArray();
    }
}