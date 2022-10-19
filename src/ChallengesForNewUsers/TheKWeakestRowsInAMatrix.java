package ChallengesForNewUsers;

import java.util.*;

public class TheKWeakestRowsInAMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> row_soldiers = new HashMap<>();

        for(int i = 0; i < mat.length; i++) { //각 행 군인수 셈
            int soldiers = 0;
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    soldiers++;
                } else {
                    break;
                }
            }
            row_soldiers.put(i, soldiers);
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(row_soldiers.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        int[] answer = new int[k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = entryList.get(i).getKey();
        }

        return answer;
    }
}
