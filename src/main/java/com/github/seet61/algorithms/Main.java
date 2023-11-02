package com.github.seet61.algorithms;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        maxConsecutiveElements("");
        maxConsecutiveElements("abcd");
        maxConsecutiveElements("abbcd");
        maxConsecutiveElements("abbcccd");
        maxConsecutiveElements("abbcccdddd");
    }

    private static void maxConsecutiveElements(String inputStr) {
        System.out.print(inputStr + ": ");
        char[] inputStrSplitted = inputStr.toCharArray();
        int result = 0;
        int curLetterIdx = 0;
        while (curLetterIdx < inputStr.length()) {
            int nextLetterIdx = curLetterIdx;
            while (nextLetterIdx < inputStr.length() && inputStrSplitted[nextLetterIdx] == inputStrSplitted[curLetterIdx]) {
                nextLetterIdx += 1;
            }
            result = Math.max(nextLetterIdx - curLetterIdx, result);
            curLetterIdx = nextLetterIdx;
        }
        System.out.println(result);
        //return result;
    }
}