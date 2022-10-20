package Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean answer = true;

        if(x < 0) {
            answer = false;
        }

        String _x = String.valueOf(x);
        for(int i = 0; i < (_x.length() / 2); i++) {
            char temp1 = _x.charAt(i);
            char temp2 = _x.charAt(_x.length() - 1 - i);

            if(temp1 != temp2) {
                answer = false;
            }
        }

        return answer;
    }
}
