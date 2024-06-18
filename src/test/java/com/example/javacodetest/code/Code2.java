package com.example.javacodetest.code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Code2 {
    public int[] solution(int l, int r) {
        List<Integer> filtered = IntStream.rangeClosed(l, r)
                .filter(num -> String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5'))
                .boxed()
                .collect(Collectors.toList());
        return filtered.isEmpty() ? new int[]{-1} : filtered.stream().mapToInt(Integer::intValue).toArray();
    }
}