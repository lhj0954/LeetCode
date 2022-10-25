package Easy;

public class ClimbingStairs {
    public static int combination (int a, int b) {
        if(b == 0) {
            return 1;
        } else {
            long temp1 = 1;
            long temp2 = 1;
            for(int i = a; i > (a - b); i--) {
                temp1 *= i;
            }
            for(int i = 1; i <= b; i++) {
                temp2 *= i;
            }

            return (int) (temp1 / temp2);
        }
    }
    public static int climbStairs(int n) {
        int answer = 0;

        int start2 = n / 2;
        int start1 = n % 2;

        for(int i = start2; i >= 0; i--) {
            answer += combination(i + start1, Math.min(i, start1));
            start1 += 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(35));
    }
}
