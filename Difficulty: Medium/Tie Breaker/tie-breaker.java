// User function Template for Java
import java.util.*;

class Solution {
    public static String TieBreak(String arr[]) {
        
        int n = arr.length;
        String[] uniqueNames = new String[n];
        int[] voteCounts = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i].equals(uniqueNames[j])) {
                    voteCounts[j] = voteCounts[j] + 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniqueNames[uniqueCount] = arr[i];
                voteCounts[uniqueCount] = 1;
                uniqueCount = uniqueCount + 1;
            }
        }

        String winner = uniqueNames[0];
        int maxVotes = voteCounts[0];

        for (int i = 1; i < uniqueCount; i++) {
            if (voteCounts[i] > maxVotes) {
                winner = uniqueNames[i];
                maxVotes = voteCounts[i];
            } else if (voteCounts[i] == maxVotes) {
                if (uniqueNames[i].compareTo(winner) < 0) {
                    winner = uniqueNames[i];
                }
            }
        }

        return winner;
        
    }
}