package uneb.main;

import uneb.candidates.Candidate;

public class ExamApp {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   UNEB CANDIDATE REGISTRATION SYSTEM             ");
        System.out.println("==================================================\n");

        System.out.println("--> Creating First Candidate (Alice):");
        Candidate c1 = new Candidate("Alice Namubiru");

        System.out.println("--> Creating Second Candidate (Bob):");
        Candidate c2 = new Candidate("Bob Mukasa");
    }
}