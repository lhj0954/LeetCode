package Easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlueOne {
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;

        for(int i = digits.length - 1; i > 0 ; i--) {
            if(digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }

        if (digits[0] == 10) {
            digits[0] = 0;
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                answer[i + 1] = digits[i];
            }
            return answer;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
