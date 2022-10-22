package Easy;

public class LenghtOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        s = s.replaceAll("\\s+", " ");

        String[] strArr = s.split(" ");

        return strArr[strArr.length - 1].length();
    }
}
