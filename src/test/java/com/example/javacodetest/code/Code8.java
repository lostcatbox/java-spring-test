package com.example.javacodetest.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code8 {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> collect = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        List<Integer> response = collect.subList(num1, num2 + 1);
        return response.stream().mapToInt(com -> com).toArray();
    }
}
