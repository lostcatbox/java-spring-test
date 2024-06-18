package com.example.javacodetest.code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Code7 {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        List<Integer> numList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(numList);
        return numList.stream().mapToInt(com -> com).toArray();
    }
}
