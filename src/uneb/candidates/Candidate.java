package uneb.candidates;

public class Candidate {
    String candidateName;
    String registrationStatus;
    String centreAssignment;

    static {
        System.out.println("[STATIC BLOCK] UNEB Exam Configuration & Center Framework initialized globally.");
    }

    {
        registrationStatus = "PENDING_VERIFICATION";
        centreAssignment = "Kampala Central Exam Hall A";
        System.out.println("[INSTANCE BLOCK] Default values assigned: Status = PENDING_VERIFICATION, " +
                "Centre = Kampala Central Hall A.");
    }

    public Candidate(String candidateName) {
        this.candidateName = candidateName;
        System.out.println("[CONSTRUCTOR] Candidate object created for: " + this.candidateName + "\n");
    }
}