package ChallengesForNewUsers;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            switch(temp) {
                case 'I':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                        answer += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        answer += 9;
                        i++;
                    } else {
                        answer += 1;
                    }
                    break;
                case 'V':
                    answer += 5;
                    break;
                case 'X':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                        answer += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        answer += 90;
                        i++;
                    } else {
                        answer += 10;
                    }
                    break;
                case 'L':
                    answer += 50;
                    break;
                case 'C':
                    if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                        answer += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        answer += 900;
                        i++;
                    } else {
                        answer += 100;
                    }
                    break;
                case 'D':
                    answer += 500;
                    break;
                case 'M':
                    answer += 1000;
                    break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
