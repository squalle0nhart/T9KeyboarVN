package com.squalle0nhart.t9keyboardvn;

import android.util.Log;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharMap {
    protected static final AbstractList<Map<Character, Integer>> CHARTABLE = new ArrayList<>(1);
    static {
        // English
        Map<Character, Integer> enMap = new HashMap<>();
        enMap.put('.', 1); enMap.put(',', 1); enMap.put('!', 1); enMap.put('?', 1);
        enMap.put('-', 1); enMap.put('"', 1); enMap.put('\'', 1); enMap.put('@', 1);
        enMap.put('#', 1); enMap.put('$', 1); enMap.put('%', 1); enMap.put('&', 1);
        enMap.put('*', 1); enMap.put('(', 1); enMap.put(')', 1); enMap.put(':', 1);
        enMap.put(';', 1); enMap.put('/', 1); enMap.put('+', 1); enMap.put('=', 1);
        enMap.put('<', 1); enMap.put('>', 1); enMap.put('^', 1); enMap.put('_', 1);
        enMap.put('~', 1); enMap.put('1', 1);
        enMap.put('a', 2); enMap.put('á', 2); enMap.put('ä', 2); enMap.put('â', 2);
        enMap.put('à', 2); enMap.put('å', 2); enMap.put('b', 2); enMap.put('c', 2);
        enMap.put('ç', 2); enMap.put('2', 2);
        enMap.put('d', 3); enMap.put('e', 3); enMap.put('é', 3); enMap.put('ë', 3);
        enMap.put('è', 3); enMap.put('ê', 3); enMap.put('f', 3); enMap.put('3', 3);
        enMap.put('g', 4); enMap.put('h', 4); enMap.put('i', 4); enMap.put('í', 4);
        enMap.put('ï', 4); enMap.put('4', 4);
        enMap.put('j', 5); enMap.put('k', 5); enMap.put('l', 5); enMap.put('5', 5);
        enMap.put('m', 6); enMap.put('n', 6); enMap.put('ñ', 6); enMap.put('o', 6);
        enMap.put('ó', 6); enMap.put('ö', 6); enMap.put('ô', 6); enMap.put('6', 6);
        enMap.put('p', 7); enMap.put('q', 7); enMap.put('r', 7); enMap.put('s', 7);
        enMap.put('7', 7);
        enMap.put('t', 8); enMap.put('u', 8); enMap.put('û', 6); enMap.put('ü', 8);
        enMap.put('v', 8); enMap.put('8', 8); enMap.put('w', 9);
        enMap.put('x', 9); enMap.put('y', 9); enMap.put('z', 9);
        enMap.put('9', 9); enMap.put('+', 0); enMap.put('0', 0);
        Map<Character, Integer> endefritmap = Collections.unmodifiableMap(enMap);
        CHARTABLE.add(0, endefritmap);
        CHARTABLE.add(1, Collections.unmodifiableMap(endefritmap));
    }

    protected static final char[][] ENT9TABLE = { { '0', '+' },
            { '.', ',', '?', '!', '"', '/', '-', '@', '$', '%', '&', '*', '#', '(', ')', '_', '1' },
            { 'a', 'b', 'c', 'A', 'B', 'C', '2' }, { 'd', 'e', 'f', 'D', 'E', 'F', '3' },
            { 'g', 'h', 'i', 'G', 'H', 'I', '4' }, { 'j', 'k', 'l', 'J', 'K', 'L', '5' },
            { 'm', 'n', 'o', 'M', 'N', 'O', '6' }, { 'p', 'q', 'r', 's', 'P', 'Q', 'R', 'S', '7' },
            { 't', 'u', 'v', 'T', 'U', 'V', '8' }, { 'w', 'x', 'y', 'z', 'W', 'X', 'Y', 'Z', '9' },
            { ' ', '\n' }, { ' ', '0', '+' }, { '\n' } }; // LAST TWO SPACE ON 0




    protected static final char[][][] T9TABLE = { ENT9TABLE };

    // last 2 don't matter, are for spaceOnZero extra 'slots' 0 position, and 10 position
    protected static final int[] ENT9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0,	 0, 0 };
    protected static final int[][] T9CAPSTART = {ENT9CAPSTART};

    protected static String getStringSequence(String word) {
        StringBuilder seq = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            Integer z = CharMap.CHARTABLE.get(0).get(0);
            if (z == null) {
                throw new NullPointerException();
            }
            seq.append(z.toString());
        }
        return seq.toString();
    }
}