package Tester;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by Patrycja on 2016-12-25.
 */
public class Bruteforce {

    private char[] charset;
    public int min; //var added for min char length
    public int max; //var added for max char length

    public Bruteforce() {
        charset = "abcdefghijklmnopqrstuvwxyzAEIOU0123456789!@#$%^&*()-_+=~`[]{}|:;<>,.?/BCDFGHJKLMNPQRSTVWXYZ".toCharArray();
        min = 5; //char min start
        max = 5; //char max end
    }

    public void generate(String str, int pos, int length) {
        if (length == 0) {
           // System.out.println(str);
        } else {

            //This if statement resets the char position back to the very first character in the character set ('a'), which makes this a complete solution to an all combinations bruteforce!
            if (pos != 0) {
                pos = 0;
            }

            for (int i = pos; i < charset.length; i++) {
                generate(str + charset[i], i, length - 1);
            }
        }
    }

}
