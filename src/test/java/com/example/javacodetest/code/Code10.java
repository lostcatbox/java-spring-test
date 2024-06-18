package com.example.javacodetest.code;


import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Code10 {

    public static boolean solution(String s) {
        final Character OPEN = '(';
        final Character CLOSE = ')';

        Stack<Character> stack = new Stack();

        for (char target: s.toCharArray()){
            if (stack.empty()){
                stack.push(target);
                continue;
            }
            Character peek = stack.peek();
            if(CLOSE.equals(peek)){
                return false;
            }
            if(CLOSE.equals(target)) {
                stack.pop();
            }
            else {
                stack.push(target);
            }
        }

        return stack.empty();
    }
    public static void main(String[] args) {
            String test1 = "()()";
            String test2 = "()()(";
            String test3 = "(())()";


            Assertions.assertTrue(()->solution(test1));
            Assertions.assertFalse(()->solution(test2));
            Assertions.assertTrue(()->solution(test3));
        }
}




