
//https://leetcode.com/problems/valid-parentheses/

package ru.gb.java;

import java.util.*;

public class HW11 {
    public static void main(String[] args) {
        String str = enteringString();
        Stack<Character> stack = new Stack<Character>();
        boolean result = isValid(str, stack);
        System.out.println(result);
    }

    public static String enteringString() {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }

    public static boolean isValid(String str, Stack<Character> stack) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if ((chars[i] == ')' && !stack.empty() && stack.lastElement() == '(')
                    || (chars[i] == '}' && !stack.empty() && stack.lastElement() == '{')
                    || (chars[i] == ']' && !stack.empty() && stack.lastElement() == '[')) {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}