package Medium;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        //동적 계획법 풀이
        int n = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[n][n];

        for (int len=0; len<n; len++) {
            for (int i=0; i+len<n; i++) {
                dp[i][i+len] = s.charAt(i) == s.charAt(i+len) && (len < 2 || dp[i+1][i+len-1]);
                if (dp[i][i+len] && len > end - start) {
                    start = i;
                    end = i + len;
                }
            }
        }

        return s.substring(start, end + 1);
        /*String answer = String.valueOf(s.charAt(0));

        for(int i = 0; i < s.length(); i++) {
            for(int j = s.length() - 1; j > i; j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    String temp = "";
                    if(j == s.length() - 1) {
                        temp = s.substring(i);
                    } else {
                        temp = s.substring(i, j + 1);
                    }
                    boolean valid = true;
                    for(int k = 0; k < temp.length() / 2; k++) {
                        if(temp.charAt(k) != temp.charAt(temp.length() - 1 - k)) {
                            valid = false;
                            break;
                        }
                    }
                    if(valid && answer.length() < temp.length()) {
                        answer = temp;
                    }
                }
            }
        }

        return answer;*/
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
