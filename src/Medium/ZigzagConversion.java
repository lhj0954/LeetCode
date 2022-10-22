package Medium;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows != 1) {
            StringBuilder[] answers = new StringBuilder[numRows];

            for (int i = 0; i < answers.length; i++) {
                answers[i] = new StringBuilder();
            }

            int index = 0;
            int convert = 1;
            for(int i = 0; i < s.length(); i++) {
                answers[index].append(s.charAt(i));
                if(index == 0) {
                    convert = 1;
                }
                if(index == numRows - 1) {
                    convert = -1;
                }
                index += convert;
            }

            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < answers.length; i++) {
                answer.append(answers[i]);
            }

            return answer.toString();
        } else {
            return s;
        }

    }

    public static void main(String[] args) {
        System.out.println(convert("AB", 2));
    }
}
