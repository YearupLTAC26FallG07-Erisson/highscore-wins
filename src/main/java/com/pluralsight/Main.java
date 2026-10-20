package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt the user for the input
        System.out.print("Please enter the game score: ");
        String input = scanner.nextLine();

        // 2. Split the input using the pipe symbol '|'
        String[] mainParts = input.split("\\|");

        String teamsPart = mainParts[0];  // e.g., "Home:Visitor"
        String scoresPart = mainParts[1]; // e.g., "21:9"

        // 3. Split the teams section by ':'
        String[] teams = teamsPart.split(":");
        String homeTeam = teams[0];
        String visitorTeam = teams[1];

        // 4. Split the scores section by ':' and convert to integers
        String[] scores = scoresPart.split(":");
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // 5. Compare the scores to determine and print the winner
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("Winner: Tie!");
        }

        scanner.close();
    }
}
