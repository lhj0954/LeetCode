package Easy;

public class Sqrt {
    public static int mySqrt(int x) {
        int answer = 0;

        long temp = 0;
        for(int i = 0; temp <= x ; i++) {
            answer = i - 1;
            temp = (long) i * i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
