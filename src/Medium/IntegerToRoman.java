package Medium;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();

        int temp1 = num % 10;
        StringBuilder _temp1 = new StringBuilder();
        switch(temp1) {
            case 4:
                _temp1.append("IV");
                break;
            case 9:
                _temp1.append("IX");
                break;
            default:
                if (temp1 >= 5) {
                    _temp1.append("V").append("I".repeat(temp1 % 5));
                } else {
                    _temp1.append("I".repeat(temp1 % 5));
                }
        }
        num /= 10;

        int temp2 = num % 10;
        StringBuilder _temp2 = new StringBuilder();
        switch(temp2) {
            case 4:
                _temp2.append("XL");
                break;
            case 9:
                _temp2.append("XC");
                break;
            default:
                if (temp2 >= 5) {
                    _temp2.append("L").append("X".repeat(temp2 % 5));
                } else {
                    _temp2.append("X".repeat(temp2 % 5));
                }
        }
        num /= 10;

        int temp3 = num % 10;
        StringBuilder _temp3 = new StringBuilder();
        switch(temp3) {
            case 4:
                _temp3.append("CD");
                break;
            case 9:
                _temp3.append("CM");
                break;
            default:
                if (temp3 >= 5) {
                    _temp3.append("D").append("C".repeat(temp3 % 5));
                } else {
                    _temp3.append("C".repeat(temp3 % 5));
                }
        }
        num /= 10;

        int temp4 = num % 10;
        StringBuilder _temp4 = new StringBuilder();
        _temp4.append("M".repeat(temp4 % 5));

        answer.append(_temp4).append(_temp3).append(_temp2).append(_temp1);

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
