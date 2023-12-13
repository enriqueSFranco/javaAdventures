package org.adventJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class AdventJava {
    public int findFirstRepeated(int[] gifts) {
        Set<Integer> setGifts = new HashSet<>();

        for (int gift : gifts) {
            if (setGifts.contains(gift)) return gift;
            else setGifts.add(gift);
        }
        return -1;
    }

    private boolean canMakeGift(String gift, String materials) {
        for (char material : gift.toCharArray()) {
            if (materials.indexOf(material) == -1)
                return false;
        }
        return true;
    }

    public ArrayList<String> manufacture(String[] gifts, String materials) {
        ArrayList<String> answer = new ArrayList<>();

        for (String gift : gifts) {
            if (this.canMakeGift(gift, materials))
                answer.add(gift);
        }

        return  answer;
    }

    public String decodeString(String message) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> lettersStack = new Stack<>();

        for (char letter : message.toCharArray()) {
            if (letter == '(') lettersStack.add(result.length());
            else if (letter == ')') {
                int startIdx = lettersStack.pop();
                String reversedSubstring = new StringBuilder(result.substring(startIdx, result.length())).reverse().toString();
                result.replace(startIdx, result.length(), reversedSubstring);
            } else result.append(letter);
        }

        return result.toString();
    }
}
