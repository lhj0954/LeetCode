package Medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            List<Character> list = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                if (list.contains(s.charAt(j))) {
                    break;
                } else {
                    list.add(s.charAt(j));
                }
            }
            if (list.size() > answer) {
                answer = list.size();
            }
            if (list.size() >= (s.length() - i)) {
                break;
            }
        }

        return answer;
    }
}
