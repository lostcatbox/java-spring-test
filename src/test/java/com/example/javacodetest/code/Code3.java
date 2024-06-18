package com.example.javacodetest.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Code3 {

    public static void main(String[] args) {
        Code3 code3 = new Code3();
        int[] solution = code3.solution(3, 2, 5);
        System.out.println("solution = " + Arrays.stream(solution));
    }

    //배열 생성
    //for 문으로 행리스트 꺼내서 전체 행으로 합침.
    public int[] solution(int n, long left, long right) {
        //list 두개를 활용 (행, 열)
        List<List<Integer>> hang = new ArrayList<>();
        IntStream.rangeClosed(0, n - 1).forEach((m) -> hang.add(new ArrayList<Integer>()));
        hang.get(0).add(0, 1);
        IntStream.rangeClosed(1, n - 1).forEach(x -> {
            IntStream.rangeClosed(1, n - 1).forEach(y -> {
                hang.get(x - 1).add(y, y + 1);
                hang.get(x).add(y - 1, y + 1);
                hang.get(x).add(y, y + 1);

            });
        });
        ArrayList<Integer> resultArray = new ArrayList<>();
        IntStream.rangeClosed(0, n).forEach((x) ->
        {
            resultArray.addAll(hang.get(x));
        });

        int[] answer = resultArray.subList((int) left, (int) right).stream().mapToInt(com -> com).toArray();
        return answer;
    }

}