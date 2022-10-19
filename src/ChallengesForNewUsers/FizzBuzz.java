package ChallengesForNewUsers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(((i + 1) % 15) == 0) {
                answer.add("FizzBuzz");
            } else if(((i + 1) % 5) == 0) {
                answer.add("Buzz");
            } else if(((i + 1) % 3) == 0) {
                answer.add("Fizz");
            } else {
                answer.add(String.valueOf((i + 1)));
            }
        }

        return answer;
    }
}
