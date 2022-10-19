package ChallengesForNewUsers;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean answer = true;
        StringBuilder _ransomNote = new StringBuilder(ransomNote);

        for(int i = 0; i < magazine.length(); i++) {
            char temp_1 = magazine.charAt(i);
            for(int j = 0; j < _ransomNote.length(); j++) {
                char temp_2 = _ransomNote.charAt(j);
                if(temp_1 == temp_2) {
                    _ransomNote.deleteCharAt(j);
                    break;
                }
            }
        }

        if (_ransomNote.length() != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "ab"));
    }
}
