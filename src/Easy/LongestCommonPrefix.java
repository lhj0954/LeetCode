package Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String answer = strs[0];

        for(int i = 1; i < strs.length; i++) {
            StringBuilder temp = new StringBuilder();
            for(int j = 0; j < Math.min(strs[i].length(), answer.length()) ; j++) {
                char ch1 = answer.charAt(j);
                char ch2 = strs[i].charAt(j);
                if(ch1 == ch2) {
                    temp.append(ch1);
                } else {
                    break;
                }
            }
            answer = temp.toString();
            if(answer.length() == 0) {
                break;
            }
        }

        return answer;
    }
}
