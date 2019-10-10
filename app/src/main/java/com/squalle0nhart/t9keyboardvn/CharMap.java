package com.squalle0nhart.t9keyboardvn;

public class CharMap {
    protected static final char[][] ENT9TABLE = {
            {' ', '0', '+'},
            {'.', ',', '?', '!', '"', '/', '-', '@', '$', '%', '&', '*', '#', '(', ')', '_', '1'},
            {'a', 'ă', 'â', 'b', 'c', '2'},
            {'d', 'đ', 'e', 'ê', 'f', '3'},
            {'g', 'h', 'i', '4'},
            {'j', 'k', 'l', '5'},
            {'m', 'n', 'o', 'ô', 'ơ', '6'},
            {'p', 'q', 'r', 's', '7'},
            {'t', 'u', 'ư', 'v', '8'},
            {'w', 'x', 'y', 'z', '9'},
            {' ', '\n'},
            {' ', '0', '+'},
            {'\n'}}; // LAST TWO SPACE ON 0


    protected static final char[][] ACCENTTABLE = {
            {'á', 'à', 'ã', 'ả', 'ạ'},
            {'ấ', 'ầ', 'ẫ', 'ẩ', 'ậ'},
            {'ắ', 'ằ', 'ẵ', 'ẳ', 'ặ'},

            {'é', 'è', 'ẽ', 'ẻ', 'ẹ'},
            {'ế', 'ề', 'ễ', 'ể', 'ệ'},

            {'ó', 'ò', 'õ', 'ỏ', 'ọ'},
            {'ố', 'ồ', 'ỗ', 'ổ', 'ộ'},
            {'ớ', 'ờ', 'ỡ', 'ở', 'ợ'},

            {'ú', 'ù', 'ũ', 'ủ', 'ụ'},
            {'ứ', 'ừ', 'ữ', 'ử', 'ự'},

            {'í', 'ì', 'ĩ', 'ỉ', 'ị'},
            {'ý', 'ỳ', 'ỹ', 'ỳ', 'ỵ'},
          };

    protected static final char[][][] T9TABLE = {ENT9TABLE};

    // last 2 don't matter, are for spaceOnZero extra 'slots' 0 position, and 10 position
    protected static final int[] ENT9CAPSTART = { 0, 0, 3, 3, 3, 3, 3, 4, 3, 4, 0, 0, 0 };
    protected static final int[][] T9CAPSTART = { ENT9CAPSTART };
}