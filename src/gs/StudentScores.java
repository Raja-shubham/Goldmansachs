package gs;

import java.util.*;

public class StudentScores {


    public static void main(String[] args) {
        String[][] scores = {
                { "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" }
        };

        System.out.println(bestAverageGrade(scores));
    }
    public static Integer bestAverageGrade(String[][] scores) {
        if (scores == null || scores.length == 0) {
            return 0; // Return 0 for empty input
        }

        // HashMap to store student names and their scores
        Map<String, List<Integer>> studentScores = new HashMap<>();

        // Iterate over the scores array
        for (String[] score : scores) {
            String student = score[0];
            int grade = Integer.parseInt(score[1]);

            // Add the score to the student's list of scores
            studentScores.computeIfAbsent(student, k -> new ArrayList<>()).add(grade);
        }

        int bestAverage = Integer.MIN_VALUE;

        // Calculate the average score for each student
        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            List<Integer> grades = entry.getValue();
            int sum = 0;

            for (int grade : grades) {
                sum += grade;
            }

            int average = sum / grades.size();

            // Keep track of the best (highest) average score
            bestAverage = Math.max(bestAverage, average);
        }

        return bestAverage;
    }
}
