package org.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class Codewars {

    public static String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        Map<Character, Character> substitutionTable = new HashMap<>();

        for (char c : key.toCharArray()) {
            if (c == ' ' || substitutionTable.containsKey((c))) continue;
            else substitutionTable.put(c, (char)('a' + substitutionTable.size()));
        }

        for (char c : message.toCharArray()) ans.append(substitutionTable.getOrDefault(c, c));

        return ans.toString();
    }

    public static int dayOfYear(String date) {
        // 2003-03-01
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        int[] dayInMonths = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = day;

        for (int i = 0; i < month; i++)
           dayOfYear += dayInMonths[i];

       return dayOfYear;
    }

    public List<List<Integer>> largeGroupPositions(String s) {
        /*
         * abbxxxxzzy
         * letters = {a: 1, b: 2, x: 3, y: 1, z: 2}
         * Un grupo se considera grande si tiene 3 o más caracteres.
         * groups = a[0], b[1,2] x[3,6], y[9], z[7, 8]
         * outpu = [3,6]
         * */
        List<List<Integer>> result = new ArrayList<>();

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            
        }

        return result;
    }
}
